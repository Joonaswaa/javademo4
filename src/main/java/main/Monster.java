package main;
import java.io.Serializable;

public class Monster implements Serializable {
    private String type;
    private int Health;


    
    
    public Monster(String type, int Health) {
        this.type = type;
        this.Health = Health;
    }

    public void printInfo(int number) {
        System.out.println(number + ": " + type + " / " + Health + "HP");
    }


    public String getType() {
        return type;
    }

    public int getHealth() {
        return Health;
    }
}

