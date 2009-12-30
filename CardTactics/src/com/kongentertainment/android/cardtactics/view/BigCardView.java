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
		return true;    	
    }
}
