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
        System.out.printf("%s uses a melee attack on %s!%n",attacker,target);
        int damage = attacker.getStr()-target.getDef();
        //System.out.printf("%s does %s damage with %s attack against %s target's %s def!%n",attacker.getClass().getSimpleName(),damage,attacker.getStr(),target.getClass().getSimpleName(),target.getDef());
        return Math.max(damage,0);
    }
    //Condensed to fewer lines by dropping the "message" string.
}
