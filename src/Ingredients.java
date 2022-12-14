import java.util.Scanner;

public class Ingredients {
    public int eggsEach;
    public int cupsOfFlour;
    public int dropsOfVanilla;
    public int sticksOfButter;
    public int cupsOfMilk;
    public int tspBakingSoda;
    public String flavorings;

    public Ingredients(int eggsEach, int cupsOfFlour, int dropsOfVanilla,
                       int sticksOfButter, int cupsOfMilk, int tspBakingSoda,
                       String flavorings) {
        this.eggsEach = eggsEach;
        this.cupsOfFlour = cupsOfFlour;
        this.dropsOfVanilla = dropsOfVanilla;
        this.sticksOfButter = sticksOfButter;
        this.cupsOfMilk = cupsOfMilk;
        this.tspBakingSoda = tspBakingSoda;
        this.flavorings = flavorings;
    }

    public Ingredients() {

    }

    public int getEggsEach() {
        return eggsEach;
    }

    public void setEggsEach(int eggsEach) {
        this.eggsEach = eggsEach;
    }

    public int getCupsOfFlour() {
        return cupsOfFlour;
    }

    public void setCupsOfFlour(int cupsOfFlour) {
        this.cupsOfFlour = cupsOfFlour;
    }

    public int getDropsOfVanilla() {
        return dropsOfVanilla;
    }

    public void setDropsOfVanilla(int dropsOfVanilla) {
        this.dropsOfVanilla = dropsOfVanilla;
    }

    public int getSticksOfButter() {
        return sticksOfButter;
    }

    public void setSticksOfButter(int sticksOfButter) {
        this.sticksOfButter = sticksOfButter;
    }

    public int getCupsOfMilk() {
        return cupsOfMilk;
    }

    public void setCupsOfMilk(int cupsOfMilk) {
        this.cupsOfMilk = cupsOfMilk;
    }

    public int getTspBakingSoda() {
        return tspBakingSoda;
    }

    public void setTspBakingSoda(int tspBakingSoda) {
        this.tspBakingSoda = tspBakingSoda;
    }

    public String getFlavorings() {
        return flavorings;
    }

    public void setFlavorings(String flavorings) {
        this.flavorings = flavorings;
    }
}
