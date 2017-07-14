// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.activities.wolvesgame;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WolvesGameBaseActivity$$ViewBinder<T extends com.zego.livedemo5.ui.activities.wolvesgame.WolvesGameBaseActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558547, "field 'toolBar'");
    target.toolBar = finder.castView(view, 2131558547, "field 'toolBar'");
    view = finder.findRequiredView(source, 2131558556, "field 'mJoinedUsers'");
    target.mJoinedUsers = finder.castView(view, 2131558556, "field 'mJoinedUsers'");
    view = finder.findRequiredView(source, 2131558528, "field 'mCurrentSpeakingHead'");
    target.mCurrentSpeakingHead = finder.castView(view, 2131558528, "field 'mCurrentSpeakingHead'");
    view = finder.findRequiredView(source, 2131558549, "field 'mTextTips'");
    target.mTextTips = finder.castView(view, 2131558549, "field 'mTextTips'");
    view = finder.findRequiredView(source, 2131558552, "field 'mTextRole'");
    target.mTextRole = finder.castView(view, 2131558552, "field 'mTextRole'");
    view = finder.findRequiredView(source, 2131558550, "field 'mTimerView'");
    target.mTimerView = finder.castView(view, 2131558550, "field 'mTimerView'");
    view = finder.findRequiredView(source, 2131558551, "field 'mBtnSpeaking'");
    target.mBtnSpeaking = finder.castView(view, 2131558551, "field 'mBtnSpeaking'");
    view = finder.findRequiredView(source, 2131558553, "field 'mInTurnSpeaking'");
    target.mInTurnSpeaking = finder.castView(view, 2131558553, "field 'mInTurnSpeaking'");
    view = finder.findRequiredView(source, 2131558554, "field 'mEndInTurnSpeaking'");
    target.mEndInTurnSpeaking = finder.castView(view, 2131558554, "field 'mEndInTurnSpeaking'");
  }

  @Override public void unbind(T target) {
    target.toolBar = null;
    target.mJoinedUsers = null;
    target.mCurrentSpeakingHead = null;
    target.mTextTips = null;
    target.mTextRole = null;
    target.mTimerView = null;
    target.mBtnSpeaking = null;
    target.mInTurnSpeaking = null;
    target.mEndInTurnSpeaking = null;
  }
}
