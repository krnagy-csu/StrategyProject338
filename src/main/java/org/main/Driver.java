package org.main;

import org.main.Monsters.Imp;
import org.main.Monsters.Kobold;
import org.main.Monsters.Monster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    private static final List<Monster> monsters = new ArrayList<>();
    public static void main(String[] args){

        populateList();
        int count = 0;
        while ((monsters.get(0).getHp() > 0) && (monsters.get(1).getHp() > 0) && count < 50){
            System.out.println(monsters.get(0).attackTarget(monsters.get(1)));
            System.out.println(monsters.get(1).attackTarget(monsters.get(0)));
            count++;
        }
        System.out.println();
        System.out.println();

        populateList();
        count = 0;
        while ((monsters.get(0).getHp() > 0) && (monsters.get(1).getHp() > 0) && count < 50){
            System.out.println(monsters.get(1).attackTarget(monsters.get(0)));
            System.out.println(monsters.get(0).attackTarget(monsters.get(1)));
            count++;
        }
    }

    static void populateList(){
        if (!monsters.isEmpty()){
            monsters.clear();
        }
        HashMap<String, Integer> items = new HashMap<>();
        items.put ("Gold", 5);
        monsters.add(new Imp(15,20,items));
        monsters.add(new Kobold(1,5,items));

        for (Monster m : monsters){
            System.out.println(m);
        }
    }
}
