package utils;

import android.content.Context;
import android.view.View;
import android.widget.TabHost.TabContentFactory;

/**
 * Created by Neelanjana on 7/5/15.
 */
public class TabFactory implements TabContentFactory {

	private final Context mContext;

	public TabFactory(Context context) {
		mContext = context;
	}

	public View createTabContent(String tag) {
		View v = new View(mContext);
		v.setMinimumWidth(0);
		v.setMinimumHeight(0);
		return v;
	}
}
