package org.main;

public class RangedAttack implements Attack{
    Monster attacker;

    public RangedAttack(Monster attacker){
        this.attacker = attacker;
    }

    /**
     * Causes the monster passed into the constructor - the attacker - to perform a ranged attack against the target.
     * @param target the enemy to be attacked
     * @return null for now
     */
    @Override
    public Integer attack (Monster target){
        System.out.printf("%s uses a ranged attack on %s!",attacker,target);
        return null;
    }

    //Condensed to fewer lines by dropping the "message" string.
}
