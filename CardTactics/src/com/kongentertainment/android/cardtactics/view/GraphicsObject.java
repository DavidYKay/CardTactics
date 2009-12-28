package com.kongentertainment.android.cardtactics.view;

import android.graphics.Bitmap;

/**
 * This class represents a bitmap and position that GameView is responsible for rendering. 
 * GraphicsObjects need to be retrieved from the relevant objects at draw time
 */
public class GraphicsObject {

    private Bitmap mBitmap;
    private int mX;
    private int mY;

    public GraphicsObject(Bitmap bitmap, int x, int y) {
        mX = x;
        mY = y;
        mBitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }
    public int getX() {
        return mX;
    }
    public int getY() {
        return mY;
    }
}
