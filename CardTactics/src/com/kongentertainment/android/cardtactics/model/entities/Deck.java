package com.kongentertainment.android.cardtactics.model.entities;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Class Deck
 */
public class Deck {

    //
    // Fields
    //
    private Stack<Card> mCards;

    //
    // Constructors
    //
    public Deck (List<Card> cards) { 
        Collections.shuffle(cards);
        //TODO: Optimize stack initialization
        for (int i=0; i<cards.size(); i++) {
            mCards.push(cards.remove(0));
        }
    };

    //
    // Methods
    //
    /**
     * Pop a card from the top of the stack.
     */
    public Card removeCard() {
        return mCards.pop();
    }
    public int size() {
    	return mCards.size();
    }
    public boolean isEmpty() {
    	return mCards.isEmpty();
    }    
}