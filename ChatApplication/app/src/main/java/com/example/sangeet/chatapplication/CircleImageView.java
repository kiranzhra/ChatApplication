package com.example.sangeet.chatapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class CircleImageView {

    public static AnimatorSet createAnimation(View view) {
        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(view, "alpha",
                0f);
        fadeOut.setDuration(300);
        ObjectAnimator mover = ObjectAnimator.ofFloat(view,
                "translationY", 400f, 0f);
        mover.setDuration(400);
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(view, "alpha",
                0f, 1f);
        fadeIn.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();

        animatorSet.play(mover);
        animatorSet.start();
        return animatorSet;

    }

    public static AnimatorSet createclickUserAnimation(View view) {
        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(view, "alpha", 0);
        fadeOut.setDuration(500);
        ObjectAnimator mover = ObjectAnimator.ofFloat(view, "translationY", -500, 0);
        mover.setDuration(400);
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(view, "alpha",
                0f, 1f);
        fadeIn.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(mover);
        animatorSet.start();
        return animatorSet;
    }
}