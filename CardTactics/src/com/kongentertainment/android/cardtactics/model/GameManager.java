package com.kongentertainment.android.cardtactics.model;

import com.kongentertainment.android.cardtactics.model.entities.GamePlayer;
import com.kongentertainment.android.cardtactics.model.entities.PlayerType;
import com.kongentertainment.android.cardtactics.model.entities.TurnMove;
import com.kongentertainment.android.cardtactics.network.NetworkManager;

/**
 * Class GameManager
 * 
 * Manages the current gamestate. This is effectively the beating heart of the entire game client.
 */
public class GameManager {
    //
    // Fields
    //
    private NetworkManager mNetworkManager;
	private GameState mGameState;

    /** holds player 1's queued TurnMove */
    private TurnMove mMoveHome;
    /** holds player 2's queued TurnMove */
    private TurnMove mMoveVisitor;

    //
    // Constructors
    //
    public GameManager () { };

    //
    // Methods
    //
	/**
	 * Store a player's intended move for execution during nextTurn
	 */
    public void setMove(PlayerType playerType, TurnMove move) {
        if (playerType == PlayerType.HOME) {
            mMoveHome = move;
        } else {
            mMoveVisitor = move;
        }
    }

	/**
	 * Key method in advancing from current turn to next turn.
	 * Executes all game phases, notifies the network manager we have completed execution
	 */
    public void nextTurn() {
        gatheringPhase();
        summoningPhase();
        movementPhase();
        abilityPhase();
        cleanupPhase();
		//Clear out the moves to prep for next turn
        mMoveHome    = null;
        mMoveVisitor = null;
		mGameState.incrementTurn();
        mNetworkManager.notifyMoveSuccess(mGameState.getTurnCount());
    }

    /** 
     * End the game, granting victory to the winner
     */
    public void surrender(GamePlayer loser) {
    }

    /**
     * Gather resources, add them to player's bank
     */
    private void gatheringPhase() {
    }
    /**
     * Summon new creatures.
     */
    private void summoningPhase() {
    }
    /**
     * Creature combat, movement occurs here.
     */
    private void movementPhase() {
    }
    /**
     * Creature abilities, resource abilities, avatar abilities happen here.
     */
    private void abilityPhase() {
    }
    /** 
     * Reset any spells or summoning sickness that needs to be resolved before next term
     */
    private void cleanupPhase() {
    }
}
