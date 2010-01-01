package com.kongentertainment.android.cardtactics.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.kongentertainment.android.cardtactics.model.entities.CreatureYard;
import com.kongentertainment.android.cardtactics.model.entities.PlayerType;
import com.kongentertainment.android.cardtactics.view.GameView.GameViewThread;

//TODO Extend widgetview
public class CreatureYardView extends WidgetView {
    //PERF: Chop these down to shorts/chars if need be
    private int mPosX;
    private int mPosY;
    private static int CELL_WIDTH  = 66;
    private static int CELL_HEIGHT = 80;

    /** The Creature Yard to pull data from */
    private CreatureYard mCreatureYard;
	private CardViewManager mCardViewManager;

	public CreatureYardView(CreatureYard creatureYard, GameViewThread gameViewThread, PlayerType playerType) {
		super(gameViewThread.getContext());
        mCreatureYard    = creatureYard;
        mCardViewManager = gameViewThread.getCardViewManager();
		
		//Get mPosX and mPosY from playerType
		if (playerType == PlayerType.HOME) {
			mPosX = 150;
			mPosY = 160;
		} else {
			mPosX = 150;
			mPosY = 0;
		}
	}
    /**
     * The meat of the class. This fetches the relevant bitmaps and draws them 
     * in the proper positions.
     */
    public void draw(Canvas canvas) {
        int x = mCreatureYard.getWidth();
        int y = mCreatureYard.getHeight();
        //For each position
        
        for (int i=0; i < x; i++) {
            for (int j=0; j < y; j++) {
                //if occupied
                if (!mCreatureYard.isEmpty(i, j)) {
                    int cardID = mCreatureYard.getCreature(i, j).getID();                    
                    Bitmap bitmap = mCardViewManager.getSmallCard(cardID);
                    //draw a card there
                    int xCoord = mPosX + (CELL_WIDTH  * i);
                    int yCoord = mPosY + (CELL_HEIGHT * j);
                    canvas.drawBitmap(bitmap, xCoord, yCoord, null);            
                } //else keep going
            }
        }
    }
}
