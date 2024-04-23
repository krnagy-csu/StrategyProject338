package org.main.Monsters;

import org.main.Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class Monster {

    private boolean isDead = false;
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
        return String.format("hp = %s/%s",hp,maxHP);
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
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(agi, monster.agi) && Objects.equals(def, monster.def) && Objects.equals(str, monster.str) && Objects.equals(atk, monster.atk) && Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, agi, def, str, atk, items);
    }

    /**
     * Returns a value between max and min.
     * @param min the smaller value passed in.
     * @param max the larger value passed in.
     * @return the value between max and min.
     */
    public Integer getAttribute(Integer min, Integer max){
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
        System.out.printf("%s was hit for %s damage!%n",this.getClass().getSimpleName(),damage);
        if (damage > 0){
            if (hp-damage <= 0){
                System.out.printf("Oh no! The creature %s has perished!%n", this.getClass().getSimpleName());
                hp = 0;
                isDead = true;
            }
            else{
                hp -= damage;
                System.out.println(this);
            }
        }
        return(hp>0);
    }

    public Integer attackTarget(Monster target){
        if (!isDead) {
            int damage = this.attack.attack(target);
            int prevHP = target.getHp();
            if (target.takeDamage(damage)) {
                return damage;
            } else {
                return prevHP;
            }
        }
        else {
            System.out.printf("%s; it is dead and cannot attack!%n", this.toString());
            return 0;
        }
    }

    public Integer getAgi() {
        return agi;
    }

    public void setAgi(Integer agi) {
        this.agi = agi;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}
