package com.kongentertainment.android.cardtactics.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector.SimpleOnGestureListener;

import com.kongentertainment.android.cardtactics.R;
import com.kongentertainment.android.cardtactics.model.entities.CreatureCard;

public class CreatureCardView extends CardView {

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
	private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    GestureDetector mGestureDetector;

	private Bitmap mBitMap;

    public CreatureCardView(Context context, CreatureCard card) {
        super(context, card);

        mGestureDetector = new GestureDetector(new MyGestureDetector());

		Resources res = context.getResources();

		mBitMap = BitmapFactory.decodeResource(res,
				R.drawable.bigcard);
		
        /*
        setOnTouchListener(new View.OnTouchListener() {
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				Log.d("CreatureCardView", "Touch event detected!");
				return false;
			}        	
        });
        */
    }
 
    //Detect touch
    class MyGestureDetector extends SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                //X swipe
                if (Math.abs(e1.getX() - e2.getX()) > SWIPE_MAX_OFF_PATH) {
                    return false;
                }
                //Swipe down
                if(e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                    Log.d("CreatureCardView", "DOWNward swipe!");
                    return true;
                //Swipe up
                }  else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                    Log.d("CreatureCardView", "UPward swipe!");
                    return true;
                }
                /*
                if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
                    return false;
                // right to left swipe
                if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                	viewFlipper.setInAnimation(slideLeftIn);
                    viewFlipper.setOutAnimation(slideLeftOut);
                	viewFlipper.showNext();
                }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                	viewFlipper.setInAnimation(slideRightIn);
                    viewFlipper.setOutAnimation(slideRightOut);
                	viewFlipper.showPrevious();
                }
                */
            } catch (Exception e) {
                // nothing
            }
            return false;
        }
    }

	/**
	 * Overridden method to draw the creaturecard
	 */
	@Override
	protected void onDraw(Canvas canvas) {
		
		canvas.drawBitmap(mBitMap, 286, 192, null);            
	}

	protected void drawAt(Canvas canvas, int x, int y) {
		canvas.drawBitmap(mBitMap, x, y, null);            
	}
    
    
    /*
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (mGestureDetector.onTouchEvent(event))
	        return true;
	    else
	    	return false;
    }
    */

    public Bitmap getBitmap() {
        return mBitMap;
    }
}
