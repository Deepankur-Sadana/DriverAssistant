package customViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import advisor.healthcare.hcaredoctorapp.R;
import utils.Utils;

public class NewHealthPagerTab extends HorizontalScrollView {

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
    private int dividerColor = Color.parseColor("#FFFFFF");

    private boolean shouldExpand = false;
    private boolean textAllCaps = true;

    private int scrollOffset = 52;
    private int indicatorHeight = 6;
    private int underlineHeight = 2;
    private int dividerPadding = 5;
    private int tabPadding = 10;
    private int dividerWidth = 1;

    private int tabTextSize = 16;
    private int tabTextColor = Color.parseColor("#000000");
    private int selectedTabTextColor = Color.parseColor("#ff0000");
    private Typeface tabTypeface = null;
    private TextView newtabs[];
    private String TAG = "tabs";
//    private int tabTypefaceStyle = Typeface.BOLD;

    private int lastScrollX = 0;

    private int tabBackgroundResId = R.drawable.background_tab;
    private HealthSlidingPanel healthSlidingPanel;

    public NewHealthPagerTab(Context context) {
        this(context, null);
        this.context = context;
    }

    public NewHealthPagerTab(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        this.context = context;
    }

    public NewHealthPagerTab(Context context, AttributeSet attrs, int defStyle) {
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

    public void setViewPager(ViewPager pager) {
        this.pager = pager;
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        pager.setOnPageChangeListener(pageListener);
        notifyDataSetChanged();
    }
    public void setViewPager(ViewPager pager,Integer textcolor,Integer selectedtextColor,Integer indicatorcolor) {
        this.tabTextColor=textcolor;
        this.selectedTabTextColor =selectedtextColor;
        this.indicatorColor=indicatorcolor;


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
        newtabs = new TextView[tabCount];
        for (int i = 0; i < tabCount; i++) {
            newtabs[i] = new TextView(getContext());
            addTextTab(i, pager.getAdapter().getPageTitle(i).toString(), 2, newtabs[i]);
        }
        updateTabStyles();
    }

    private void addTextTab(final int position, String title) {

        TextView tab = new TextView(getContext());
        tab.setText(title);
        tab.setFocusable(true);
        tab.setGravity(Gravity.CENTER);
        tab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(position);
            }
        });
        tabsContainer.addView(tab);
        tab.setId(position);
    }

    private void updateTabStyles() {
        int width = 50;
        if (tabCount > 2) {

            width = context.getResources().getConfiguration().screenWidthDp / 3;
            defaultTabLayoutParams = new LinearLayout.LayoutParams(Utils.getDIP(context, width), LayoutParams.MATCH_PARENT);
        } else {
            defaultTabLayoutParams = new LinearLayout.LayoutParams(0, LayoutParams.MATCH_PARENT, 1f);
        }
        for (int i = 0; i < tabCount; i++) {
            View v = tabsContainer.getChildAt(i);
            v.setLayoutParams(defaultTabLayoutParams);
            v.setBackgroundResource(tabBackgroundResId);
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

    private void addTextTab(final int position, String title, Integer asdf, TextView tab) {

        tab.setText(title);
        tab.setFocusable(true);
        tab.setTextColor(selectedTabTextColor);
        tab.setGravity(Gravity.CENTER);
        tab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(position);
            }
        });
        tab.setId(position);
        tab.setTag(position);
        tabsContainer.addView(tab);

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


    private void updateTextColor(Integer pos) {
        TextView x = (TextView) tabsContainer.findViewById(0);
        TextView y = (TextView) tabsContainer.findViewById(1);
        TextView z = (TextView) tabsContainer.findViewById(2);

        switch (pos){
            case 0:
                x.setTextColor(selectedTabTextColor);
                y.setTextColor(tabTextColor);
                z.setTextColor(tabTextColor);
                break;
            case 1:
                x.setTextColor(tabTextColor);
                y.setTextColor(selectedTabTextColor);
                z.setTextColor(tabTextColor);
                break;
            case 2:
                x.setTextColor(tabTextColor);
                y.setTextColor(tabTextColor);
                z.setTextColor(selectedTabTextColor);
                break;
        }

    }

    private class PageListener implements OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            currentPosition = position;
            currentPositionOffset = positionOffset;
            scrollToChild(position, (int) (positionOffset * tabsContainer.getChildAt(position).getWidth()));
            updateTextColor(position);
            invalidate();
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }

        @Override
        public void onPageSelected(int position) {

        }
    }

    public void setSlidingPanel(HealthSlidingPanel healthSlidingPanel) {
        this.healthSlidingPanel = healthSlidingPanel;
    }
}