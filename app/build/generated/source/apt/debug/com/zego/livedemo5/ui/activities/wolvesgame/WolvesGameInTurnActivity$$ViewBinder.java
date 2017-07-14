// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.activities.wolvesgame;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class WolvesGameInTurnActivity$$ViewBinder<T extends com.zego.livedemo5.ui.activities.wolvesgame.WolvesGameInTurnActivity> extends com.zego.livedemo5.ui.activities.wolvesgame.WolvesGameBaseActivity$$ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    super.bind(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131558551, "method 'onStartOrStopSpeakingClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onStartOrStopSpeakingClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    super.unbind(target);

  }
}
