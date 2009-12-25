package com.kongentertainment.android.cardtactics.model.entities;

/**
 * Class to encapsulate an attack entity.
 * The backbone of the combat system.
 */
public class Attack {
    private int mDamage;  
    private DamageType mDamageType;  

    public Attack(DamageType damageType, int damage) {
        mDamageType = damageType;
        mDamage = damage;
    }

    public int getDamage() {
        return mDamage;
    }
    public DamageType getDamageType() {
        return mDamageType;
    }
}
