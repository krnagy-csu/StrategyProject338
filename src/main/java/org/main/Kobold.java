package org.main;

import java.util.HashMap;

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
    }

    @Override
    public String toString () {
        return String.format("Kobold has : %s",super.toString());
    }
}
