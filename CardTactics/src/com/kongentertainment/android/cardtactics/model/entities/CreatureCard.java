package com.kongentertainment.android.cardtactics.model.entities;

import com.kongentertainment.android.cardtactics.model.ModelConstants;

/**
 * Class CreatureCard
 */
public class CreatureCard extends Card implements ModelConstants {

    //
    //
    // Fields
    //

    /** Used to indicate that a unit has been given an order */
    private boolean mBusy;
    /** Unit's Vertical position */
    private int mRow;
    /** Unit's Horizontal position */
    private int mColumn;
    /** Unit's Hit points */
    private int mHP;
    /** Unit's Max Hit points */
    private int mMaxHP;
    /** Unit's Attack ability */
    private Attack mAttack;

    //
    // Constructors
    //
    public CreatureCard(int cardID) {
        super (cardID);
        //Lookup other attributes based on cardID
    }
    //******************************
    // COMBAT METHODS
    //******************************
    Attack getAttack() {
        return mAttack;
    }

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
    void moveUp() {
        if (mRow < ROW_MAX) mRow++;
    }

    void moveDown() {
        if (mRow > ROW_MIN) mRow--;
    }

    //
    // Accessor methods
    //

    //
    // Other methods
    //
}
