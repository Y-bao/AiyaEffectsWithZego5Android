// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.activities.externalrender;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BaseExternalRenderActivity$$ViewBinder<T extends com.zego.livedemo5.ui.activities.externalrender.BaseExternalRenderActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558535, "method 'openLogList'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openLogList();
        }
      });
    view = finder.findRequiredView(source, 2131558537, "method 'publishSettings'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.publishSettings();
        }
      });
    view = finder.findRequiredView(source, 2131558536, "method 'doMute'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.doMute();
        }
      });
    view = finder.findRequiredView(source, 2131558539, "method 'close'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.close();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
