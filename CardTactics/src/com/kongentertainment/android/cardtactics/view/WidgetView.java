package com.kongentertainment.android.cardtactics.view;

import android.content.Context;
import android.view.View;

public abstract class WidgetView extends View implements ViewConstants {
    /** X Position on canvas */
    protected int mPosX;
    /** Y Position on canvas */
    protected int mPosY;

    protected int mRight;
    protected int mBottom;

	public WidgetView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

    public int getPosX() {
        return mPosX;
    }
    public int getPosY() {
        return mPosY;
    }
    /*
    public int getRight() {
        return mRight;
    }
    public int getBottom() {
        return mBottom;
    }
    */
}
