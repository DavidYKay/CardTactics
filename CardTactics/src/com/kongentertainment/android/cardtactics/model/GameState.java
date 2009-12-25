package com.kongentertainment.android.cardtactics.model;

import com.kongentertainment.android.cardtactics.model.entities.CreatureYard;
import com.kongentertainment.android.cardtactics.model.entities.GamePlayer;
import com.kongentertainment.android.cardtactics.model.entities.PlayerType;

/**
 * Class which holds all relevant information to the current state of the game
 */
public class GameState {

    private GamePlayer mPlayerHome;
    private GamePlayer mPlayerVisitor;

    /** Creature cards live/move/act here */
    private CreatureYard mYardHome;
    /** Creature cards live/move/act here */
    private CreatureYard mYardVisitor;
    //Resource cards

    /** What turn is it? */
    private int mTurnCount;

    public void incrementTurn() {
        mTurnCount++;
    }

    public int getTurnCount() {
        return mTurnCount;
    }

    public GamePlayer getPlayer(PlayerType playerType) {
        if (playerType == PlayerType.HOME) {
            return mPlayerHome;
        } else {
            return mPlayerVisitor;
        }
    }

    public CreatureYard getYard(PlayerType playerType) {
        if (playerType == PlayerType.HOME) {
            return mYardHome;
        } else {
            return mYardVisitor;
        }
    }
}
