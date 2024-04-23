package org.main.Monsters;

import org.main.Abilities.MeleeAttack;

import java.util.HashMap;

public class Imp extends Monster {
    HashMap<String, Integer> stats = new HashMap<String,Integer>();
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        stats.put("str",super.getAttribute(str,maxStr));
        stats.put("def",super.getAttribute(def,maxDef));
        stats.put("agi",super.getAttribute(agi,maxAgi));

        str = stats.get("str");
        def = stats.get("def");
        agi = stats.get("agi");

        attack = new MeleeAttack(this);
    }

    @Override
    public String toString () {
        return String.format("Imp has : %s",super.toString());
    }
}
