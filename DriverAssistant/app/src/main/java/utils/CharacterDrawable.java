package utils;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/**
 * Created by sumanta on 12/5/15.
 */

public class CharacterDrawable extends ShapeDrawable {

    private final Paint textPaint;
    private String text;
    private Integer[] colorsList = {0xffe57373, 0xfff06292, 0xffba68c8, 0xff9575cd, 0xff7986cb,
            0xff64b5f6, 0xff4fc3f7, 0xff4db6ac, 0xff81c784, 0xffaed581, 0xffff8a65, 0xffd4e157, 0xffffd54f,
            0xffffb74d, 0xffa1887f, 0xff90a4ae};

    public static CharacterDrawable getDrawable(String text) {
        return new CharacterDrawable(text);
    }

    private CharacterDrawable(String text) {
        super(new OvalShape());
        try {
            String[] nameArray = text.split(" ");
            this.text = nameArray[0].substring(0, 1).toUpperCase() + nameArray[1].substring(0, 1).toUpperCase();
        } catch (Exception e) {
            this.text = "U";
        }
        textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTypeface(Typeface.create("sans-serif-light", Typeface.BOLD));
        textPaint.setTextAlign(Paint.Align.CENTER);
        Paint paint = getPaint();
        paint.setColor(getColor(this.text));
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Rect r = getBounds();
        int count = canvas.save();
        canvas.translate(r.left, r.top);
        textPaint.setTextSize(Math.min(r.width(), r.height()) / 2);
        canvas.drawText(text, r.width() / 2, r.height() / 2 - ((textPaint.descent() + textPaint.ascent()) / 2), textPaint);
        canvas.restoreToCount(count);
    }

    @Override
    public void setAlpha(int alpha) {
        textPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        textPaint.setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override
    public int getIntrinsicHeight() {
        return -1;
    }

    public int getColor(Object key) {
        return colorsList[Math.abs(key.hashCode()) % colorsList.length];
    }
}
