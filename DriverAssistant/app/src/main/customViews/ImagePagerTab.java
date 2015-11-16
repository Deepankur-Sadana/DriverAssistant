package customViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import advisor.healthcare.hcaredoctorapp.R;
import advisor.healthcare.hcaredoctorapp.activities.BaseActivity;
import fragments.BaseFragment;
import utils.Utils;

public class ImagePagerTab extends HorizontalScrollView {

    private static final int[] ATTRS = new int[]{
            android.R.attr.textSize,
            android.R.attr.textColor
    };
    private Context context;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    private final PageListener pageListener = new PageListener();
    private LinearLayout tabsContainer;
    private ViewPager pager;
    private int tabCount;
    private int currentPosition = 0;
    private float currentPositionOffset = 0f;

    private Paint rectPaint;
    private Paint dividerPaint;
    private int indicatorColor = Color.parseColor("#50D2C2");
    private int underlineColor = Color.parseColor("#50D2C2");
    private int dividerColor = Color.parseColor("#00FFFFFF");

    private boolean shouldExpand = false;

    private int scrollOffset = 52;
    private int indicatorHeight = 4;
    private int underlineHeight = 2;
    private int dividerPadding = 5;
    private int tabPadding = 10;
    private int dividerWidth = 1;

    private int tabTextSize = 16;
    private int tabTextColor = Color.parseColor("#000000");
    private int selectedTabTextColor = Color.parseColor("#ff0000");
    private ImageView newimg[];
    private String TAG = "tabs";
    private Integer resourceImageIds[];
    private BaseActivity activity;
    private Integer tempPosition;
//    private int tabTypefaceStyle = Typeface.BOLD;

    private int lastScrollX = 0;

    public ImagePagerTab(Context context) {
        this(context, null);
        this.context = context;
    }

    public ImagePagerTab(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        this.context = context;
    }

    public ImagePagerTab(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;

        setFillViewport(true);
        setWillNotDraw(false);

        tabsContainer = new LinearLayout(context);
        tabsContainer.setOrientation(LinearLayout.HORIZONTAL);
        tabsContainer.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        addView(tabsContainer);

        DisplayMetrics dm = getResources().getDisplayMetrics();

        scrollOffset = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, scrollOffset, dm);
        indicatorHeight = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, indicatorHeight, dm);
        underlineHeight = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, underlineHeight, dm);
        dividerPadding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dividerPadding, dm);
        tabPadding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, tabPadding, dm);
        dividerWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dividerWidth, dm);
        tabTextSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, tabTextSize, dm);

        TypedArray a = context.obtainStyledAttributes(attrs, ATTRS);

        tabTextSize = a.getDimensionPixelSize(0, tabTextSize);
        tabTextColor = a.getColor(1, tabTextColor);
        rectPaint = new Paint();
        rectPaint.setAntiAlias(true);
        rectPaint.setStyle(Style.FILL);

        dividerPaint = new Paint();
        dividerPaint.setAntiAlias(true);
        dividerPaint.setStrokeWidth(dividerWidth);
    }


    public void setViewPager(ViewPager pager, Integer textcolor, Integer selectedtextColor, Integer indicatorcolor) {
        this.tabTextColor = textcolor;
        this.selectedTabTextColor = selectedtextColor;
        this.indicatorColor = indicatorcolor;
        activity = BaseActivity.getInstance();

        this.pager = pager;
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        pager.setOnPageChangeListener(pageListener);
        notifyDataSetChanged();
    }

    public void notifyDataSetChanged() {
        tabsContainer.removeAllViews();
        tabCount = pager.getAdapter().getCount();
        newimg = new ImageView[tabCount];
        resourceImageIds = new Integer[tabCount];
        resourceImageIds[0] = R.mipmap.ic_doctor;
        resourceImageIds[1] = R.mipmap.ic_appointments;
        resourceImageIds[2] = R.mipmap.ic_patients;
        resourceImageIds[3] = R.mipmap.ic_menu;
        for (int i = 0; i < tabCount; i++) {
            newimg[i] = new ImageView(getContext());
            addImageTab(i, resourceImageIds[i], newimg[i]);
        }
        updateTabStyles();
    }

    private void updateTabStyles() {
        int width = 50;
        if (tabCount > 2) {

            width = context.getResources().getConfiguration().screenWidthDp / 4;
            defaultTabLayoutParams = new LinearLayout.LayoutParams(Utils.getDIP(context, width), LayoutParams.MATCH_PARENT);
        } else {
            defaultTabLayoutParams = new LinearLayout.LayoutParams(0, LayoutParams.MATCH_PARENT, 1f);
        }
        for (int i = 0; i < tabCount; i++) {
            View v = tabsContainer.getChildAt(i);
            v.setLayoutParams(defaultTabLayoutParams);
            //// TODO: 30-09-2015 remove
            //  v.setBackgroundResource(tabBackgroundResId);
            if (shouldExpand) {
                v.setPadding(0, 0, 0, 0);
            } else {
                v.setPadding(tabPadding, 0, tabPadding, 0);
            }

            if (v instanceof TextView) {
                TextView tab = (TextView) v;
                tab.setTextSize(TypedValue.COMPLEX_UNIT_PX, tabTextSize);
//                tab.setTypeface(tabTypeface, tabTypefaceStyle);
                tab.setTextColor(tabTextColor);
            }
        }

    }

    private void scrollToChild(int position, int offset) {

        if (tabCount == 0) {
            return;
        }
        int newScrollX = tabsContainer.getChildAt(position).getLeft() + offset;
        if (position > 0 || offset > 0) {
            newScrollX -= scrollOffset;
        }
        if (newScrollX != lastScrollX) {
            lastScrollX = newScrollX;
            scrollTo(newScrollX, 0);
        }
    }

    private void addImageTab(final int position, Integer id, ImageView img) {
        img.setImageResource(id);
        img.setFocusable(true);
        img.setVisibility(VISIBLE);
        img.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(position);
            }
        });

        img.setId(position);
        img.setTag(position);
        tabsContainer.setPadding(0, 15, 0, 15);
        tabsContainer.addView(img);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (isInEditMode() || tabCount == 0) {
            return;
        }

        final int height = getHeight();
        rectPaint.setColor(indicatorColor);
        View currentTab = tabsContainer.getChildAt(currentPosition);
        float lineLeft = currentTab.getLeft();
        float lineRight = currentTab.getRight();
        if (currentPositionOffset > 0f && currentPosition < tabCount - 1) {

            View nextTab = tabsContainer.getChildAt(currentPosition + 1);
            final float nextTabLeft = nextTab.getLeft();
            final float nextTabRight = nextTab.getRight();

            lineLeft = (currentPositionOffset * nextTabLeft + (1f - currentPositionOffset) * lineLeft);
            lineRight = (currentPositionOffset * nextTabRight + (1f - currentPositionOffset) * lineRight);
        }

        canvas.drawRect(lineLeft, height - indicatorHeight, lineRight, height, rectPaint);
        rectPaint.setColor(underlineColor);
        dividerPaint.setColor(dividerColor);
        for (int i = 0; i < tabCount - 1; i++) {
            View tab = tabsContainer.getChildAt(i);
            canvas.drawLine(tab.getRight(), dividerPadding, tab.getRight(), height - dividerPadding, dividerPaint);
        }
    }


    private class PageListener implements OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            currentPosition = position;
            currentPositionOffset = positionOffset;
            scrollToChild(position, (int) (positionOffset * tabsContainer.getChildAt(position).getWidth()));
            //   updateTextColor(position);
            invalidate();
            tempPosition = position;
            setTitle(activity);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }

        @Override
        public void onPageSelected(int position) {
            tempPosition = position;
            //setTitle(activity);
            String title[] = {"My Feed", "My Appointments", "My Patients", "More"};
            BaseFragment.hitMPData(activity, title[tempPosition], null);
        }
    }

    private void setTitle(BaseActivity activ) {
        String title[] = {"My Feed", "My Appointments", "My Patients", "More"};
        activ.setActionBarTitle(title[tempPosition]);
        //BaseFragment.hitMPData(activity,title[tempPosition],null);
    }

}