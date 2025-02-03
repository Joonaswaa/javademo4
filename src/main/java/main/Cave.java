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
        int i = 1;
        for (Monster monster : monsters) {
            monster.printInfo(i);
            i++; 
        }
    }    
}
