package org.main.Monsters;

import org.main.Abilities.RangedAttack;

import java.util.HashMap;

public class Kobold extends Monster {
    HashMap<String, Integer> stats = new HashMap<String,Integer>();
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
        Integer maxStr = 15;
        Integer maxDef = 3;
        Integer maxAgi = 3;

        stats.put("str", super.getAttribute(str, maxStr));
        stats.put("def", super.getAttribute(def, maxDef));
        stats.put("agi", super.getAttribute(agi, maxAgi));

        str = stats.get("str");
        def = stats.get("def");
        agi = stats.get("agi");
        attack = new RangedAttack(this);
    }

    @Override
    public String toString () {
        return String.format("Kobold has : %s",super.toString());
    }
}
