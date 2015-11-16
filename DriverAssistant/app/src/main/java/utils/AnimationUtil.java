package utils;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.deepankur.newproject.R;


public class AnimationUtil {
    public static  void showView(Context context, final View view){
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_in_left);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation paramAnimation) {
                view.setVisibility(View.VISIBLE);
            }
            @Override
            public void onAnimationRepeat(Animation paramAnimation) {}
            @Override
            public void onAnimationEnd(Animation paramAnimation) {
            }
        });
        view.startAnimation(animation);
    }
    public static void hideView(final Context context, final boolean isFragPop, final View view){
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_out_right);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                enableDisableView(view, false);
                view.setVisibility(View.GONE);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                if(isFragPop){
                    ((FragmentActivity)context).getSupportFragmentManager().popBackStackImmediate();
                }
            }
        });
        view.startAnimation(animation);
    }
    public static void enableDisableView(View view, boolean enabled) {
        view.setEnabled(enabled);
        if ( view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup)view;
            for ( int id = 0 ; id < group.getChildCount() ; id++ ) {
                enableDisableView(group.getChildAt(id), enabled);
            }
        }
    }
}
