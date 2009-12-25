package com.kongentertainment.android.cardtactics.view;

import android.graphics.drawable.Drawable;

import com.kongentertainment.android.cardtactics.model.entities.Card;

/**
 * View that represents a card
 * @author dk
 *
 */
public abstract class CardView {
	/** We hold a card entity so we know what we're drawing */
	protected Card mCard;
	/** The image occupying the top half of the card */
	protected Drawable mTopImage;
	/** The image occupying the bottom half of the card */
	protected Drawable mBottomImage;

    public CardView(Card card) {
        mCard = card;
        //Find matching TopImage, BottomImage
    }

    public Card getCard() {
        return mCard;
    }
}
