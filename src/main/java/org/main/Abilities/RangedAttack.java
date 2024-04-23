package org.main.Abilities;

import org.main.Monsters.Monster;

public class RangedAttack implements Attack {
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
        System.out.printf("%s uses a ranged attack on %s!%n",attacker,target);
        int damage = attacker.getAgi()-target.getDef();
        //System.out.printf("%s does %s damage with %s attack against %s target's %s def!%n",attacker.getClass().getName(),damage,attacker.getAgi(),target.getClass().getName(),target.getDef());
        return Math.max(damage,0);
    }

    //Condensed to fewer lines by dropping the "message" string.
}
