package utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/**
 * Created by Neelanjana on 12-07-2015.
 */
public class RoundedBackgroundSpan extends ReplacementSpan
{
	private final int mPadding = 20;
	private int mBackgroundColor;
	private int mTextColor;
	private Context mContext;

	public RoundedBackgroundSpan(Context context,int backgroundColor, int textColor) {
		super();
		mBackgroundColor = backgroundColor;
		mTextColor = textColor;
		this.mContext = context;
	}

	@Override
	public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
		return (int) (mPadding + paint.measureText(text.subSequence(start, end).toString()) + mPadding);
	}

	@Override
	public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint)
	{
		float width = paint.measureText(text.subSequence(start, end).toString());
		RectF rect = new RectF(x, top, x + width + 2*mPadding, bottom);
		paint.setColor(Color.parseColor("#40D2C2"));
		canvas.drawRoundRect(rect, mPadding, mPadding, paint);
		paint.setColor(mTextColor);
		canvas.drawText(text, start, end, x+mPadding, y, paint);
	}
}

