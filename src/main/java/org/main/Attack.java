package org.main;

public interface Attack extends Ability{

    /**
     * Abstract method that allows attacks to be defined.
     * @param m the monster to be attacked.
     * @return nothing; it's abstract.
     */
    public Integer attack(Monster m);

}
