import java.util.Scanner;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int boredom;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 10;
        this.thirst = 10;
        this.boredom = 10;
    }

    public void feed() {
        hunger -= 2;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void giveDrink() {
        thirst -= 2;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void play() {
        boredom -= 2;
        if (boredom < 0) {
            boredom = 0;
        }
    }

    public void tick() {
        hunger += 1;
        thirst += 1;
        boredom += 1;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }
}

