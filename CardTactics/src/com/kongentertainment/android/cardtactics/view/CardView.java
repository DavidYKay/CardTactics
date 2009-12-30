package com.kongentertainment.android.cardtactics.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.kongentertainment.android.cardtactics.model.entities.Card;

/**
 * View that represents a card
 * @author dk
 *
 */
public abstract class CardView extends View {
//	public CardView(Context context) {
//		super(context);
//		// TODO Auto-generated constructor stub
//	}

	/** We hold a card entity so we know what we're drawing */
	protected Card mCard;
    /** X Position on canvas */
    protected int mPosX;
    /** Y Position on canvas */
    protected int mPosY;

	/** The image occupying the top half of the card */
	protected Drawable mTopImage;
	/** The image occupying the bottom half of the card */
	protected Drawable mBottomImage;

    public CardView(Context context, Card card) {
    	super(context);
        mCard = card;
        //Find matching TopImage, BottomImage
    }
    
    public Card getCard() {
        return mCard;
    }
    public int getPosX() {
        return mPosX;
    }
    public int getPosY() {
        return mPosY;
    }
}
