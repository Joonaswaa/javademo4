package main;
import java.io.Serializable;
import java.util.ArrayList;

public class Cave implements Serializable {
    private Player player;
    private ArrayList<Monster> monsters = new ArrayList<>();

    public Cave(Player player){
        this.player = player;

    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }
    
    public void listMonsters() {
        if (monsters.isEmpty()) {
            System.out.println("Luola on tyhjä.");
        } else {
            int i = 1;
            for (Monster monster : monsters) {
                System.out.println("Luolan hirviöt:");
                monster.printInfo(i);
                i++;
            }
        }  
    }
}