package org.main.Abilities;

import org.main.Monsters.Monster;

public interface Attack extends Ability{

    /**
     * Abstract method that allows attacks to be defined.
     * @param m the monster to be attacked.
     * @return nothing; it's abstract.
     */
    public Integer attack(Monster m);

}
