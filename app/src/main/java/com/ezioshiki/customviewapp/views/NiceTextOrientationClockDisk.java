package com.ezioshiki.customviewapp.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import com.ezioshiki.customviewapp.R;

/**
 * Created by EzioShiki on 15/10/28.
 */
public class NiceTextOrientationClockDisk extends View{


    private static final float COSINE_30_DEGREES = ((float) Math.sqrt(3)) * 0.5f;
    private static final float SINE_30_DEGREES = 0.5f;
    String[] HoursString = {"12","1","2","3","4","5","6","7","8","9","10","11"};

    public NiceTextOrientationClockDisk(Context context) {
        super(context);
    }

    public NiceTextOrientationClockDisk(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NiceTextOrientationClockDisk(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);





    }

    @Override
    protected void onDraw(Canvas canvas) {



        float numbersRadius =
                (getMeasuredWidth()>getMeasuredHeight() ? getMeasuredHeight(): getMeasuredWidth())/2-100;


        //30,60,90三角形的长边长度
        final float lSide = numbersRadius * COSINE_30_DEGREES;
        //30,60,90三角形的短边长度
        final float sSide = numbersRadius * SINE_30_DEGREES;
        //30,60,90三角形的斜边为numbersRadius

        drawSelector(canvas);

        drawTextElements(canvas,
                32,
                Typeface.create(Typeface.DEFAULT,Typeface.NORMAL),
                HoursString,
                lSide,
                sSide,
                numbersRadius,
                50,50,
                new TextPaint(),
                getContext().getColor(R.color.colorAccent),
                255
                );
    }

    private void drawTextElements(Canvas canvas,float textSize,Typeface typeface,String[] texts,
                                  float longSide, float shortSide,float radius,float originalPointX,
                                  float originalPointY, Paint paint,
                                  int color , int alpha) {

        float l = longSide;
        float s = shortSide;
        float r = radius;

        float ox = originalPointX;
        float oy = originalPointY;



        paint.setTextSize(textSize);
        paint.setTypeface(typeface);
        paint.setColor(color);
        paint.setAlpha(getMultipliedAlpha(color,alpha));
        canvas.drawText(texts[0],ox+r,oy+0,paint);
        canvas.drawText(texts[1],ox+r+s,oy+r-l,paint);
        canvas.drawText(texts[2],ox+r+l,oy+r-s,paint);
        canvas.drawText(texts[3],ox+r+r,oy+r,paint);
        canvas.drawText(texts[4],ox+r+l,oy+r+s,paint);
        canvas.drawText(texts[5],ox+r+s,oy+r+l,paint);
        canvas.drawText(texts[6],ox+r,oy+r+r,paint);
        canvas.drawText(texts[7],ox+r-s,oy+r+l,paint);
        canvas.drawText(texts[8],ox+r-l,oy+r+s,paint);
        canvas.drawText(texts[9],ox+0,oy+r,paint);
        canvas.drawText(texts[10],ox+r-l,oy+r-s,paint);
        canvas.drawText(texts[11],ox+r-s,oy+r-l,paint);

    }



    private void drawSelector(Canvas canvas) {

    }

    private void caculateGridSizeHours(Paint paint,float numbersRadius,float xCenter,float yCenter,
                                       float textSize, float[] textGridHeights, float[] textGridWidths) {
        //30,60,90三角形的长边长度
        final float lSide = numbersRadius * COSINE_30_DEGREES;
        //30,60,90三角形的短边长度
        final float sSide = numbersRadius * SINE_30_DEGREES;
        //30,60,90三角形的斜边为numbersRadius

        paint.setTextSize(textSize);







    }

    private int getMultipliedAlpha(int argb, int alpha) {
        return (int) (Color.alpha(argb) * (alpha / 255.0) + 0.5);
    }
}
