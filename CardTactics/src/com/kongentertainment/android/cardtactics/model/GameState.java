package com.kongentertainment.android.cardtactics.model;

public class GameState {

    /** What turn is it? */
    private int mTurnCount;

    public void incrementTurn() {
        mTurnCount++;
    }
}
