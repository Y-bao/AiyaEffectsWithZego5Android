package com.zego.livedemo5;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.aiyaapp.camera.sdk.AiyaEffects;
import com.aiyaapp.camera.sdk.base.ActionObserver;
import com.aiyaapp.camera.sdk.base.Event;
import com.tencent.bugly.crashreport.CrashReport;
import com.zego.livedemo5.utils.LiveQualityLogger;
import com.zego.livedemo5.utils.PreferenceUtil;


/**
 * des: 自定义Application.
 */
public class ZegoApplication extends Application implements Thread.UncaughtExceptionHandler{

    public static final String TAG = ZegoApplication.class.getSimpleName();

    public static Context sApplicationContext;

    Thread.UncaughtExceptionHandler mDefaultHandler;

    @Override
    public void onCreate() {
        super.onCreate();

        sApplicationContext = this;

        // 初始化sdk
        ZegoApiManager.getInstance().initSDK(getResources());

        final ActionObserver observer = new ActionObserver() {
            @Override
            public void onAction(Event state) {
                if (state.eventType == Event.RESOURCE_FAILED) {
                    com.aiyaapp.camera.sdk.base.Log.e("resource failed");
                } else if (state.eventType == Event.RESOURCE_READY) {
                    com.aiyaapp.camera.sdk.base.Log.e("resource ready");
                } else if (state.eventType == Event.INIT_FAILED) {
                    com.aiyaapp.camera.sdk.base.Log.e("init failed");
                    Toast.makeText(ZegoApplication.this, "注册失败，请检查网络", Toast.LENGTH_SHORT)
                            .show();
                    AiyaEffects.getInstance().unRegisterObserver(this);
                } else if (state.eventType == Event.INIT_SUCCESS) {
                    com.aiyaapp.camera.sdk.base.Log.e("init success");
                    AiyaEffects.getInstance().unRegisterObserver(this);
                }
            }
        };
        AiyaEffects.getInstance().registerObserver(observer);
        AiyaEffects.getInstance().init(ZegoApplication.this, "");
        AiyaEffects.getInstance().setEffect("assets/modelsticker/grass/meta.json");

        // bugly初始化用户id
        CrashReport.initCrashReport(getApplicationContext(), "2da9d0c1ef", false);
        CrashReport.setUserId(PreferenceUtil.getInstance().getUserID());

//        // 获取系统默认的UncaughtException处理器
//        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
//        // 设置该CrashHandler为程序的默认处理器
//        Thread.setDefaultUncaughtExceptionHandler(this);

        // delete latest traffic log then create a new log file
        LiveQualityLogger.openAndReset();
    }

    public Context getApplicationContext(){
        return sApplicationContext;
    }

    /**
     * 当UncaughtException发生时会转入该函数来处理
     */
    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        if (!handleException(ex) && mDefaultHandler != null) {
            //如果用户没有处理则让系统默认的异常处理器来处理
            mDefaultHandler.uncaughtException(thread, ex);
        } else {
            try {
                // 暂停3秒
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Log.e(TAG, "error : ", e);
            }
            // 退出程序
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }

    /**
     * 自定义错误处理,收集错误信息 发送错误报告等操作均在此完成.
     *
     * @param ex
     * @return true:如果处理了该异常信息;否则返回false.
     */
    private boolean handleException(Throwable ex) {
        if (ex == null) {
            return false;
        }
        // 使用Toast来显示异常信息
        new Thread() {
            @Override
            public void run() {
                Looper.prepare();
                Toast.makeText(sApplicationContext, "程序出现异常，即将退出～", Toast.LENGTH_SHORT).show();
                Looper.loop();
            }
        }.start();

        return true;
    }
}
