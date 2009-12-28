package com.kongentertainment.android.cardtactics.view;

import java.util.HashMap;

import android.graphics.Bitmap;

/**
 * Keeps a collection of relevant Card bitmaps to draw on the screen
 */
public class CardViewManager {

    //PERF: Convert these to an arraylist implementation if performance is an issue
    //If a card is in either deck, its full image should be in here:
    private HashMap<String, Bitmap> mBigCards;
    //If a card is in either deck, its small image should be in here:
    private HashMap<String, Bitmap> mSmallCards;

    public CardViewManager () {
        mBigCards   = new HashMap<String, Bitmap>();
        mSmallCards = new HashMap<String, Bitmap>();
    }

    public Bitmap getBigCard(String cardName) {
        return mBigCards.get(cardName);
    }
    public Bitmap getSmallCard(String cardName) {
        return mSmallCards.get(cardName);
    }

    public void putBigCard(String cardName, Bitmap bitmap) {
        mBigCards.put(cardName, bitmap);
    }
    public void putSmallCard(String cardName, Bitmap bitmap) {
        mSmallCards.put(cardName, bitmap);
    }
}
