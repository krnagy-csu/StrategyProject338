package org.main.Abilities;

import org.main.Monsters.Monster;

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    /**
     * Causes the monster passed into the constructor - the attacker - to melee attack the target.
     * @param target the enemy to be attacked
     * @return null for now
     */
    @Override
    public Integer attack (Monster target){
        System.out.printf("%s uses a melee attack on %s!",attacker,target);
        return null;
    }

    //Condensed to fewer lines by dropping the "message" string.
}
