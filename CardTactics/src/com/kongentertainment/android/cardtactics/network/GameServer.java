package com.kongentertainment.android.cardtactics.network;

/**
 * Class GameServer
 * Responsible for sending GameCommands between two GameClients.
 */
public class GameServer {

    //
    // Fields
    //
    //private GameClient mClient1;
    //private GameClient mClient2;

    //
    // Constructors
    //
  public GameServer () { };
  
    //
    // Methods
    //

    private void onReceiveCommand() {
      //Received a command from one client
      //Log it
      //Send it to the other client
    }
    /**
     * Takes two clients and starts a game
     */
    private void startGame()
        //notify both clients of each other's IPs?
        //notify both clients that the game is about to begin -- time to start picking decks?
    }
    /**
     * Notify both clients that game has ended.
     */
    private void endGame() {
    }
    /**
     * Once both servers have notified us that they are quitting, we terminate.
     * We also terminate if we have a timeout condition.
     */
    private void terminateServer() {
    }

    //
    // Accessor methods
    //

    //
    // Other methods
    //

}
