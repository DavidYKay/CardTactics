package com.kongentertainment.android.cardtactics.model.entities;

import com.kongentertainment.android.cardtactics.model.ModelConstants;

/**
 * Class CreatureCard
 * Holds all key state and attribute variables for a creature.
 */
public class CreatureCard extends Card implements ModelConstants {

    //
    //
    // Fields
    //

    /** Used to indicate that a unit has been given an order */
    private boolean mBusy;
    ///** Unit's Vertical position */
    //private int mRow;
    ///** Unit's Horizontal position */
    //private int mColumn;
    /** Unit's Hit points */
    private int mHP;
    /** Unit's Max Hit points */
    private int mMaxHP;
    /** Unit's Attack ability */
    private Attack mAttack;
    /** Unit's Special ability */
    private CreatureAbility mAbility;

    //
    // Constructors
    //
    public CreatureCard(int cardID) {
        super (cardID);
        //Lookup other attributes based on cardID
        mHP = mMaxHP;
    }
    //******************************
    // COMBAT METHODS
    //******************************

    void takeDamage(int amount) {
        mHP -= amount;
        //Check if dead
        if (mHP <= 0) {
            die();
        }
    }

    void die() {
        //Notify gameManager that we have died
    }
    //******************************
    // MOVEMENT METHODS
    //******************************
    //void moveUp() {
    //    if (mRow < ROW_MAX) mRow++;
    //}

    //void moveDown() {
    //    if (mRow > ROW_MIN) mRow--;
    //}

    //
    // Accessor methods
    //
    Attack getAttack() {
        return mAttack;
    }

    CreatureAbility getAbility() {
        return mAbility;
    }

    public int getHP() {
        return mHP;
    }

    public boolean isBusy() {
        return mBusy;
    }
    //
    // Other methods
    //
}
