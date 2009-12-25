package com.kongentertainment.android.cardtactics.model.entities;



/**
 * Class Card
 */
public abstract class Card {

    //
    // Fields
    //
    protected int mCardID;
    protected CardType mCardType;
    protected PlayerType mOwner;
  
    //
    // Constructors
    //
    public Card (int cardID) { 
        mCardID = cardID;
        //Lookup other attributes based on cardID
    };

    //
    // Methods
    //


    //
    // Accessor methods
    //
    public CardID getID() {
        return mCardID;
    }
    public CardType getType() {
        return mCardType;
    }
    public PlayerType getOwner() {
        return mOwner;
    }

    //
    // Other methods
    //

}
