// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.activities.wolvesgame;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class WolvesGameHostActivity$$ViewBinder<T extends com.zego.livedemo5.ui.activities.wolvesgame.WolvesGameHostActivity> extends com.zego.livedemo5.ui.activities.wolvesgame.WolvesGameBaseActivity$$ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    super.bind(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131558551, "method 'onButtonClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558553, "method 'onButtonClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558554, "method 'onButtonClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onButtonClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    super.unbind(target);

  }
}
