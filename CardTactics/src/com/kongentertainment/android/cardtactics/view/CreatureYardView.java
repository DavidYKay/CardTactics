package com.kongentertainment.android.cardtactics.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.kongentertainment.android.cardtactics.model.entities.CreatureYard;

public class CreatureYardView {

    /** The Creature Yard to pull data from */
    private CreatureYard mCreatureYard;


    public void draw(Canvas canvas) {
        int x = mCreatureYard.getWidth();
        int y = mCreatureYard.getHeight();
        //For each position
        for (int i=0; i < x; i++) {
            for (int j=0; j < y; j++) {
                //if occupied
                if (!mCreatureYard.isEmpty(x, y)) {
                    //draw a card there
                    //Bitmap bitmap = CardViewManager.getBigCard(mCreatureYard.getCreature(x, y));

                } //else keep going
            }
        }
    }
}
