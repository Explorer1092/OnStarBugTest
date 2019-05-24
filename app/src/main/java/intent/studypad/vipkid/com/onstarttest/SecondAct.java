package intent.studypad.vipkid.com.onstarttest;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;

public class SecondAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View viewById = findViewById(R.id.test);


        //使用属性动画不会导致这个bug
        ObjectAnimator animator = ObjectAnimator.ofFloat(viewById, "rotation", 0f, 360f);
        animator.setDuration(2000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.start();


        //如果使用补间动画，下面的代码会导致不执行上一个页面的onStop方法,这应该是一个系统bug
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                AnimationHelper mAnimationHelper = new AnimationHelper();
//                Animation outerAnimation = mAnimationHelper.getOuterAnimation(SecondAct.this);
//                RotateAnimation rotateAnimation = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF,
//                        0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                rotateAnimation.setDuration(1000);
//                rotateAnimation.setRepeatCount(1000);//设置重复次数
//                rotateAnimation.setFillAfter(false);//动画执行完后是否停留在执行完的状态
//                viewById.setAnimation(rotateAnimation);
//                rotateAnimation.start();
//            }
//        });
//        mAnimationHelper.startAnimation(
//                viewById, outerAnimation, 0);
    }
}
