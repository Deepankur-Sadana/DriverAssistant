package com.example.deepankur.newproject;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager.BackStackEntry;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import customViews.AppAlertDialog;
import utils.ConnectionUtils;

public abstract class BaseActivity extends AppCompatActivity {

    private boolean mOnStopCalled;
    private static BaseActivity sInstance;
    private FrameLayout mMainLayout;
    private ProgressBar mProgressBar;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle arg0) {
        // TODO Auto-generated method stub
        super.onCreate(arg0);

        mOnStopCalled = false;
        BaseActivity.sInstance = this;
        setContentView(getLayoutId());
        mMainLayout = (FrameLayout) findViewById(R.id.content_frame);

    }

    public static BaseActivity getInstance() {
        return sInstance;
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
        if (title != null && !title.trim().isEmpty()) {
            TypedValue tv = new TypedValue();
            this.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true);
            int actionBarHeight = getResources().getDimensionPixelSize(tv.resourceId);
            mMainLayout.setPadding(0, actionBarHeight, 0, 0);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));
        }
    }

    /**
     * set Action bar icon where needed
     *
     * @param icon
     */
    public void setActionBarIcon(Integer icon) {
        if (icon != 0)
            getSupportActionBar().setIcon(icon);
    }

    /**
     * back button handling method for complete app extending "this" activity
     */
    public void setUpBackButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
    }


    public void hideBackButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    public void makeActionBarTransparent(String title) {
        getSupportActionBar().setTitle(title);
        mMainLayout.setPadding(0, 0, 0, 0);
        getSupportActionBar().setBackgroundDrawable(new
                ColorDrawable(Color.TRANSPARENT));

    }

    public android.support.v7.app.ActionBar getActivityActionBar() {
        return getSupportActionBar();
    }


    protected abstract int getLayoutId();

    @Override
    protected void onStop() {
        super.onStop();
        mOnStopCalled = true;
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        mOnStopCalled = true;
        super.onPause();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        mOnStopCalled = false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (BaseActivity.sInstance == this) {
            BaseActivity.sInstance = null;
        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        // TODO Auto-generated method stub
        super.onNewIntent(intent);
        mOnStopCalled = false;
    }

    public FrameLayout getMainLayout() {
        if (mMainLayout == null) {
            mMainLayout = (FrameLayout) findViewById(R.id.content_frame);
        }

        return mMainLayout;
    }

    public ProgressBar getProgressBar() {
        if (mProgressBar == null) {
            mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        }

        return mProgressBar;
    }

    private int contentLayoutId() {
        if (mMainLayout == null) {
            mMainLayout = (FrameLayout) findViewById(R.id.content_frame);
        }

        return mMainLayout.getId();
    }

    public <T extends BaseActivity> void switchActivity(Class<T> activityClass) {
        switchActivity(activityClass, null);
    }

    public <T extends BaseActivity> void switchActivity(Class<T> activityClass, Bundle b) {
        Intent intent = new Intent(this, activityClass);
        if (b != null) {
            intent.putExtras(b);
        }

        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }

    public int replaceFragment(Fragment fragment, String tag) {
        if (mOnStopCalled) {
            return -1;
        } else {
            popToRootFragment();
            return replaceFragment(fragment, tag, FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        }

    }

    public int justReplaceFragment(Fragment fragment, String tag) {

        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out,
                android.R.animator.fade_in, android.R.animator.fade_out);
        trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        if (tag == null) {
            tag = fragment.getClass().getSimpleName();
        }

        trans.replace(contentLayoutId(), fragment, tag);
        return trans.commit();
    }

    protected int replaceFragment(Fragment fragment, String tag, int transition) {
        return replaceFragment(fragment, tag, transition, contentLayoutId());
    }

    protected int replaceFragment(Fragment fragment, String tag, int transition, int layoutId) {
        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out,
                android.R.animator.fade_in, android.R.animator.fade_out);
        trans.setTransition(transition);
        if (tag == null) {
            tag = fragment.getClass().getSimpleName();
        }

        trans.replace(layoutId, fragment, tag);
        return trans.commit();
    }

    public void pushFragment(Fragment fragment, String tag) {
        if (!mOnStopCalled) {
            pushFragment(fragment, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        }
    }

    public int pushFragment(Fragment fragment, String tag, int transition) {
        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.setTransition(transition);
        if (tag == null || tag.isEmpty()) {
            tag = fragment.getClass().getSimpleName();
        }

        trans.replace(contentLayoutId(), fragment, tag);
        trans.addToBackStack(tag);
        return trans.commit();
    }

    public int removeCurrentFragment(Fragment fragment) {
        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.remove(fragment);
        return trans.commit();
    }

    // private Fragment getCurrentFragment() {


    @Override
    public void onBackPressed() {
        try {
            if (getFragmentManager().getBackStackEntryCount() == 0 && getViewPager().getCurrentItem() == 0) {
                AppAlertDialog dialog = new AppAlertDialog(this, true) {
                    @Override
                    public void onConfirmation() {
                        super.onConfirmation();
                        //finish app on confirmation
                        finish();
                    }
                };
                dialog.show("Exit!", "Are you sure you want to exit?");
            } else if (getFragmentManager().getBackStackEntryCount() == 0) {
                getViewPager().setCurrentItem(0);

            } else {
                getFragmentManager().popBackStack();
            }
        } catch (Exception e) {
            finish();
            e.printStackTrace();
        }
    }

    //handle view pager on Doctor and Packages Fragment
    public ViewPager getViewPager() {
        return (ViewPager) findViewById(R.id.vpPager);
    }

    public boolean popFragment() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            try {
                BackStackEntry entry = getFragmentManager()
                        .getBackStackEntryAt(getFragmentManager().getBackStackEntryCount() - 1);
                Fragment fragment = getFragmentManager().findFragmentByTag(entry.getName());
                FragmentTransaction trans = getFragmentManager().beginTransaction();
                trans.remove(fragment);
                getFragmentManager().popBackStack();
                trans.commit();
                return true;

            } catch (IllegalStateException e) {
                // TODO: handle exception
            }
        }
        return false;
    }

    public boolean popToRootFragment() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {

            for (int i = 0; i < getFragmentManager().getBackStackEntryCount(); i++) {
                try {
                    BackStackEntry entry = getFragmentManager().getBackStackEntryAt(i);
                    Fragment fragment = getFragmentManager().findFragmentByTag(entry.getName());
                    FragmentTransaction trans = getFragmentManager().beginTransaction();
                    trans.remove(fragment);
                    getFragmentManager().popBackStack();
                    trans.commit();
                } catch (IllegalStateException e) {
                    // TODO: handle exception
                }
            }
            return true;
        }
        return false;
    }

    public void clearFragmentTrack() {
        if (mOnStopCalled) {
            return;
        } else {
            FragmentManager fm = this.getFragmentManager();
            Log.d("fmfm", String.valueOf(fm.getBackStackEntryCount()));
            for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {

                Log.d("fmfm", String.valueOf(i));
                fm.popBackStack();
            }
        }

    }

    public static void clearFragmentBackStack(Integer count) {

        FragmentManager fm = getInstance().getFragmentManager();
        Log.d("fmfm", String.valueOf(fm.getBackStackEntryCount()));
        if (count > fm.getBackStackEntryCount())
            return;
        for (int i = 0; i < count; ++i) {

            Log.d("fmfm", String.valueOf(i));
            fm.popBackStack();
        }


    }
    boolean isInternetPresent = false;

    /**
     * Check internet availability
     * @return
     */
    public boolean isInternetAvailable() {
        try {
            isInternetPresent = ConnectionUtils.isNetworkAvailable(this);
            if (!isInternetPresent) {
                Toast.makeText(this, "No Internet Connection", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isInternetPresent;
    }


}
