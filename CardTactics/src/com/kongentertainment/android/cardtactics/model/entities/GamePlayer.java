package com.kongentertainment.android.cardtactics.model.entities;

/**
 * Class GamePlayer
 */
abstract public class GamePlayer {

    //
    // Fields
    //
    /** Cards currently in player's hand */
    protected Hand mHand;
    /** Deck of player's cards */
    protected Deck mDeck;
    /** Holds a player's resources */
    protected int mBank;

    //
    // Constructors
    //
    public GamePlayer () { };

    //
    // Methods
    //

    public void drawCard() {
        mHand.addCard(mDeck.removeCard());
    }

    public void addToBank(int resources) {
        mBank += resources;
    }

    //
    // Accessor methods
    //
    public int getBank() {
        return mBank;
    }

    public Hand getHand() {
        return mHand;
    }
    
    public Deck getDeck() {
        return mDeck;
    }

    //
    // Other methods
    //
}
