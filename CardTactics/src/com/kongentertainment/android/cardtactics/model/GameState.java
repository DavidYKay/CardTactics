package com.kongentertainment.android.cardtactics.model;

import com.kongentertainment.android.cardtactics.model.entities.GamePlayer;

public class GameState {

    private GamePlayer mPlayerHome;
    private GamePlayer mPlayerVisitor;

    //Creature cards
    
    //Resource cards

    /** What turn is it? */
    private int mTurnCount;

    public void incrementTurn() {
        mTurnCount++;
    }

    public int getTurnCount() {
        return mTurnCount;
    }
}
