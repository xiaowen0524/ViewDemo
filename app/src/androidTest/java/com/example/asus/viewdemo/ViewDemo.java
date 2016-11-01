package com.example.asus.viewdemo;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.graphics.Bitmap;
/**
 * Created by asus on 2016/11/1.
 */
public class ViewDemo extends View {
    public ViewDemo(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(this.getResources(), R.drawable.bb);
        canvas.drawBitmap(bitmap, 0, 0, paint);
        if (bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
