// Generated code from Butter Knife. Do not modify!
package com.zego.livedemo5.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RoomListFragment$$ViewBinder<T extends com.zego.livedemo5.ui.fragments.RoomListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558588, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131558588, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558589, "field 'rlvRoomList'");
    target.rlvRoomList = finder.castView(view, 2131558589, "field 'rlvRoomList'");
    view = finder.findRequiredView(source, 2131558590, "field 'tvHintPullRefresh'");
    target.tvHintPullRefresh = finder.castView(view, 2131558590, "field 'tvHintPullRefresh'");
  }

  @Override public void unbind(T target) {
    target.swipeRefreshLayout = null;
    target.rlvRoomList = null;
    target.tvHintPullRefresh = null;
  }
}
