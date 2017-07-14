package com.zego.livedemo5.videofilter;

import android.content.res.Resources;

import com.zego.livedemo5.aiya.AiyaFilterDemo;
import com.zego.zegoliveroom.videofilter.ZegoVideoFilter;
import com.zego.zegoliveroom.videofilter.ZegoVideoFilterFactory;

/**
 * Created by robotding on 16/12/3.
 */

public class VideoFilterFactoryDemo extends ZegoVideoFilterFactory {
    private int mode = 5;
    private ZegoVideoFilter mFilter = null;
    private Resources mRes;

    public VideoFilterFactoryDemo(Resources res){
        this.mRes=res;
    }

    public ZegoVideoFilter create() {
//        switch (mode) {
//            case 0:
//                mFilter = new VideoFilterMemDemo();
//                break;
//            case 1:
//                mFilter = new VideoFilterSurfaceTextureDemo();
//                break;
//            case 2:
//                mFilter = new VideoFilterHybridDemo();
//                break;
//            case 3:
//                mFilter = new VideoFilterSurfaceTextureDemo2();
//                break;
//            case 4:
//                mFilter = new VideoFilterSurfaceTextureDemo2();
//                break;
//            case 5:
//                mFilter = new VideoFilterI420MemDemo();
//                break;
//        }
        mFilter=new AiyaFilterDemo(mRes);
        return mFilter;
    }

    public void destroy(ZegoVideoFilter vf) {
        mFilter = null;
    }
}
