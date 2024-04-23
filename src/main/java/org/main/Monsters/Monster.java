package org.main.Monsters;

import org.main.Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    Integer agi = 10;
    Integer def = 10;
    Integer str = 10;
    Integer atk = 10;
    private HashMap<String, Integer> items;
    Attack attack;

    public Monster(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString() {
        return String.format("hp = %s/%s%n",hp,maxHP);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, items);
    }

    /**
     * Returns a value between max and min.
     * @param min the smaller value passed in.
     * @param max the larger value passed in.
     * @return the value between max and min.
     */
    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if (min>max){
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max-min) + min;
    }

    /** Given an amount of damage, removes it from the creature's health.
     *  If the creature dies, returns false.
     *
     * @param damage the amount of damage taken
     * @return true if the poor lil guy is still alive, or else false.
     */
    boolean takeDamage(Integer damage){
        if (damage > 0){
            if (hp-damage <= 0){
                System.out.printf("Oh no! The creature has perished!%n");
                hp = 0;
            }
            else{
                hp -= damage;
            }
        }
        System.out.println(this.toString());
        return(hp>0);
    }

    
}
