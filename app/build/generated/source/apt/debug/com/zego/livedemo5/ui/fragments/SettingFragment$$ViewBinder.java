// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SettingFragment$$ViewBinder<T extends com.zego.livedemo5.ui.fragments.SettingFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558592, "field 'tvsdkVersion'");
    target.tvsdkVersion = finder.castView(view, 2131558592, "field 'tvsdkVersion'");
    view = finder.findRequiredView(source, 2131558593, "field 'etUserAccount'");
    target.etUserAccount = finder.castView(view, 2131558593, "field 'etUserAccount'");
    view = finder.findRequiredView(source, 2131558594, "field 'etUserName'");
    target.etUserName = finder.castView(view, 2131558594, "field 'etUserName'");
    view = finder.findRequiredView(source, 2131558595, "field 'spinnerResolutions'");
    target.spinnerResolutions = finder.castView(view, 2131558595, "field 'spinnerResolutions'");
    view = finder.findRequiredView(source, 2131558596, "field 'tvResolution'");
    target.tvResolution = finder.castView(view, 2131558596, "field 'tvResolution'");
    view = finder.findRequiredView(source, 2131558597, "field 'seekbarResolution'");
    target.seekbarResolution = finder.castView(view, 2131558597, "field 'seekbarResolution'");
    view = finder.findRequiredView(source, 2131558598, "field 'tvFps'");
    target.tvFps = finder.castView(view, 2131558598, "field 'tvFps'");
    view = finder.findRequiredView(source, 2131558599, "field 'seekBarFps'");
    target.seekBarFps = finder.castView(view, 2131558599, "field 'seekBarFps'");
    view = finder.findRequiredView(source, 2131558600, "field 'tvBitrate'");
    target.tvBitrate = finder.castView(view, 2131558600, "field 'tvBitrate'");
    view = finder.findRequiredView(source, 2131558601, "field 'seekBarBitrate'");
    target.seekBarBitrate = finder.castView(view, 2131558601, "field 'seekBarBitrate'");
    view = finder.findRequiredView(source, 2131558602, "field 'tvDemoVersion' and method 'showHideOperation'");
    target.tvDemoVersion = finder.castView(view, 2131558602, "field 'tvDemoVersion'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showHideOperation();
        }
      });
    view = finder.findRequiredView(source, 2131558606, "field 'llytHideOperation'");
    target.llytHideOperation = finder.castView(view, 2131558606, "field 'llytHideOperation'");
    view = finder.findRequiredView(source, 2131558607, "field 'tbTestEnv' and method 'onCheckedChanged1'");
    target.tbTestEnv = finder.castView(view, 2131558607, "field 'tbTestEnv'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged1(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558608, "field 'spAppFlavors'");
    target.spAppFlavors = finder.castView(view, 2131558608, "field 'spAppFlavors'");
    view = finder.findRequiredView(source, 2131558609, "field 'etAppID'");
    target.etAppID = finder.castView(view, 2131558609, "field 'etAppID'");
    view = finder.findRequiredView(source, 2131558610, "field 'llAppKey'");
    target.llAppKey = finder.castView(view, 2131558610, "field 'llAppKey'");
    view = finder.findRequiredView(source, 2131558611, "field 'etAppKey'");
    target.etAppKey = finder.castView(view, 2131558611, "field 'etAppKey'");
    view = finder.findRequiredView(source, 2131558591, "field 'scrollView'");
    target.scrollView = finder.castView(view, 2131558591, "field 'scrollView'");
    view = finder.findRequiredView(source, 2131558612, "field 'tbVideoCapture' and method 'onCheckedChanged2'");
    target.tbVideoCapture = finder.castView(view, 2131558612, "field 'tbVideoCapture'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged2(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558614, "field 'tbVideoFilter' and method 'onCheckedChanged2'");
    target.tbVideoFilter = finder.castView(view, 2131558614, "field 'tbVideoFilter'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged2(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558613, "field 'tbExternalRender' and method 'onCheckedChanged2'");
    target.tbExternalRender = finder.castView(view, 2131558613, "field 'tbExternalRender'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged2(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558615, "field 'tbHardwareEncode' and method 'onCheckedChanged1'");
    target.tbHardwareEncode = finder.castView(view, 2131558615, "field 'tbHardwareEncode'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged1(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558616, "field 'tbHardwareDecode' and method 'onCheckedChanged1'");
    target.tbHardwareDecode = finder.castView(view, 2131558616, "field 'tbHardwareDecode'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged1(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558617, "field 'tbRateControl' and method 'onCheckedChanged1'");
    target.tbRateControl = finder.castView(view, 2131558617, "field 'tbRateControl'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged1(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558618, "method 'onCheckedChanged1'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged1(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558619, "method 'onCheckedChanged1'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.onCheckedChanged1(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131558605, "method 'showAdvanced'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showAdvanced();
        }
      });
    view = finder.findRequiredView(source, 2131558603, "method 'uploadLog'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.uploadLog();
        }
      });
    view = finder.findRequiredView(source, 2131558604, "method 'openAboutPage'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openAboutPage();
        }
      });
  }

  @Override public void unbind(T target) {
    target.tvsdkVersion = null;
    target.etUserAccount = null;
    target.etUserName = null;
    target.spinnerResolutions = null;
    target.tvResolution = null;
    target.seekbarResolution = null;
    target.tvFps = null;
    target.seekBarFps = null;
    target.tvBitrate = null;
    target.seekBarBitrate = null;
    target.tvDemoVersion = null;
    target.llytHideOperation = null;
    target.tbTestEnv = null;
    target.spAppFlavors = null;
    target.etAppID = null;
    target.llAppKey = null;
    target.etAppKey = null;
    target.scrollView = null;
    target.tbVideoCapture = null;
    target.tbVideoFilter = null;
    target.tbExternalRender = null;
    target.tbHardwareEncode = null;
    target.tbHardwareDecode = null;
    target.tbRateControl = null;
  }
}
