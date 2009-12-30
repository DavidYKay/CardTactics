package com.kongentertainment.android.cardtactics.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;

import com.kongentertainment.android.cardtactics.model.entities.Card;
import com.kongentertainment.android.cardtactics.view.GameView.GameViewThread;

public class BigCardView extends CardView {

    private GameViewThread mGameViewThread;

	public BigCardView(Context context, Card card) {
		super(context, card);
		// TODO Auto-generated constructor stub        
	}
	
	public BigCardView(Card card, GameViewThread gameViewThread) {
		super (gameViewThread.getContext(), card);
		mGameViewThread = gameViewThread;		
		mPosX = 100;
        mPosY = 100;	
	}

    public void draw(Canvas canvas) {
        int cardID = mCard.getID();                    
        Bitmap bitmap = mGameViewThread.getCardViewManager().getBigCard(cardID);
        //draw a card there
        int xCoord = mPosX;
        int yCoord = mPosY;
        canvas.drawBitmap(bitmap, xCoord, yCoord, null);            
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
    	Log.d("BigCardView", "Touch event felt by BigCardView!");

        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
    	switch(motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //if (mEngine.canStartLineAt(x, y)) {
                //    mDirectionPoint =
                //            new DirectionPoint(x, y);
                //}
                return true;
            case MotionEvent.ACTION_MOVE:
                mPosX = (int) x - (BIG_CARD_WIDTH / 2);
                mPosY = (int) y - (BIG_CARD_HEIGHT / 2);
                return true;
            case MotionEvent.ACTION_UP:
                return true;
            default:
                return true;    	
        }
    }
}
