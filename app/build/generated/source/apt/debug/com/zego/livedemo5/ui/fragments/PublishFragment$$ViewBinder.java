// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PublishFragment$$ViewBinder<T extends com.zego.livedemo5.ui.fragments.PublishFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558581, "field 'tbEnableFrontCam'");
    target.tbEnableFrontCam = finder.castView(view, 2131558581, "field 'tbEnableFrontCam'");
    view = finder.findRequiredView(source, 2131558582, "field 'tbEnableTorch'");
    target.tbEnableTorch = finder.castView(view, 2131558582, "field 'tbEnableTorch'");
    view = finder.findRequiredView(source, 2131558584, "field 'spFilters'");
    target.spFilters = finder.castView(view, 2131558584, "field 'spFilters'");
    view = finder.findRequiredView(source, 2131558585, "field 'spBeauties'");
    target.spBeauties = finder.castView(view, 2131558585, "field 'spBeauties'");
    view = finder.findRequiredView(source, 2131558586, "field 'etPublishTitle'");
    target.etPublishTitle = finder.castView(view, 2131558586, "field 'etPublishTitle'");
    view = finder.findRequiredView(source, 2131558525, "field 'textureView'");
    target.textureView = finder.castView(view, 2131558525, "field 'textureView'");
    view = finder.findRequiredView(source, 2131558587, "method 'startPublishing'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startPublishing();
        }
      });
    view = finder.findRequiredView(source, 2131558527, "method 'hideInputWindow'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.hideInputWindow();
        }
      });
  }

  @Override public void unbind(T target) {
    target.tbEnableFrontCam = null;
    target.tbEnableTorch = null;
    target.spFilters = null;
    target.spBeauties = null;
    target.etPublishTitle = null;
    target.textureView = null;
  }
}
