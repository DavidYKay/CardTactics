package com.kongentertainment.android.cardtactics.model.entities;

import java.util.ArrayList;

/**
 * Class Hand
 * Represents a player's hand of cards
 * TODO: Limit # of cards in hand.
 * TODO: Move this to an array implementation?
 */
public class Hand {

    //
    // Fields
    //
    private ArrayList<Card> mCards;

    //
    // Constructors
    //
    public Hand () { 
        mCards = new ArrayList<Card>();
    };

    //
    // Methods
    //
    /**
     * Adds a card to the hand.
     */
    public void addCard(Card card) {
        //TODO Check if we're above MAX_IN_HAND
        //If not, add the card
        mCards.add(card);
    }

    /**
     * Removes a card the hand and returns it.
     */
    public Card removeCard(int cardIndex) {
        //Remove card from hand
        Card card = mCards.remove(cardIndex);
        //Return card
        return card;
    }

    /**
     * Returns a list of cards from the player's hand
     */
    public ArrayList<Card> getCards() {
        return mCards;
    }

    public int size() {
        return mCards.size();
    }
    public boolean isEmpty() {
        return mCards.isEmpty();
    }
}
