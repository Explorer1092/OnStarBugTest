package intent.studypad.vipkid.com.onstarttest;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/** @author lizheng create at 2019/3/29 description: */
public class AnimationHelper {

  private Animation mOuterAnimation;
  private Animation mInnerAnimation;
  private Animation mCenterAnimation;

  /**
   * 获取到外环的动画
   *
   * @return animation for outer
   */
  public Animation getOuterAnimation(Context context) {
    if (mOuterAnimation == null) {
      mOuterAnimation = AnimationUtils.loadAnimation(context, R.anim.course_title_anim_outer);
    }
    return mOuterAnimation;
  }

  public Animation getInnerAnimation(Context context) {
    if (mInnerAnimation == null) {
      mInnerAnimation = AnimationUtils.loadAnimation(context, R.anim.course_title_anim_inner);
    }
    return mInnerAnimation;
  }

  public Animation getCenterAnimation(Context context) {
    if (mCenterAnimation == null) {
      mCenterAnimation = AnimationUtils.loadAnimation(context, R.anim.course_title_anim_center);
    }
    return mCenterAnimation;
  }

  /**
   * 开始动画
   *
   * @param view 动画view
   * @param animation 动画
   */
  public void startAnimation(View view, Animation animation) {
    startAnimation(view, animation, 0);
  }

  /**
   * 开始动画
   *
   * @param view 动画view
   * @param animation 动画
   */
  public void startAnimation(View view, Animation animation, long delay) {
    Animation viewAnimation = view.getAnimation();
    if (viewAnimation == null) {
      // null表示当前view还没有动画，如果不为null，表示已经开始执行动画了
      animation.setStartTime(AnimationUtils.currentAnimationTimeMillis() + delay);
      view.setAnimation(animation);
    }
  }

  /**
   * 结束动画
   *
   * @param view view
   */
  public void clearAnimation(View... view) {
    for (View v : view) {
      Animation animation = v.getAnimation();
      if (animation != null) {
        animation.reset();
      }
      v.clearAnimation();
    }
  }

  /**
   * 隐藏View
   *
   * @param view view
   */
  public void setVisible(int visible, View... view) {
    for (View v : view) {
      v.setVisibility(visible);
    }
  }
}
