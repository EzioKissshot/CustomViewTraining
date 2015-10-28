package com.ezioshiki.customviewapp.views;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by EzioShiki on 15/10/27.
 */
public class ClockDisk extends View {

    public ClockDisk(Context context) {
        super(context);
    }

    public ClockDisk(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ClockDisk(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

        TextPaint clockNumPaint = new TextPaint();


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {


        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width ;
        int height;

        setMeasuredDimension(500,500);




    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int heigth = getHeight();
        int width = getWidth();

        for (int i = 0; i<12;i++){
            String clockNum;
            if (i==0){
                clockNum="12";
            }else {
                clockNum=i+"";
            }

            canvas.drawText(clockNum,width/2,heigth/5,clockNumPaint);
            canvas.rotate(30,width/2,heigth/2);
        }


    }
}
