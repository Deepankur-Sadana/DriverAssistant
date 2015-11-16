package customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListView;

public class CustomExpandedListView extends ListView {

	boolean isExapanded;

	public CustomExpandedListView(Context context) {
		super(context);
	}

	public CustomExpandedListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomExpandedListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		if (isExpanded()) {
			int expandSpec = MeasureSpec.makeMeasureSpec(
					Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
			super.onMeasure(widthMeasureSpec, expandSpec);

			ViewGroup.LayoutParams params = getLayoutParams();
			params.height = getMeasuredHeight();
		} else {
			super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		}

	}

	public void setExpanded(boolean isExpanded) {
		this.isExapanded = isExpanded;
	}

	public boolean isExpanded() {
		return isExapanded;
	}

}
