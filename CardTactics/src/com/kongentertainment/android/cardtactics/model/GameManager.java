package com.kongentertainment.android.cardtactics.model;



/**
 * Class GameManager
 * 
 * Manages the current gamestate. This is effectively the beating heart of the entire game client.
 */
public class GameManager {

    //
    // Fields
    //
    private GamePlayer mPlayerHome;
    private GamePlayer mPlayerVisitor;
    private NetworkManager mNetworkManager;

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
    public setMove(PlayerType playerType, TurnMove move) {
        if (playerType == PlayerType.HOME) {
            mMoveHome = move;
        } else {
            mMoveVisitor = move;
        }
    }

    public makeMove(GamePlayer player, GameMove move) {
        //
        //Update game state based on move
        //Notify server we have received the move properly
        mNetworkManager.notifyMoveSuccess(move);
    }

    public nextTurn() {
        //Execute gathering phase
        //execute summoning phase
        //execute movement/action phase
        //execute ability phase
        
    }
    public surrender(GamePlayer loser) {
        //End the game, granting victory to the winner
    }
}
