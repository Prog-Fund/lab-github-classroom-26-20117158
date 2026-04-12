package models;

public class Cat extends Mammal{
    private String favouriteToy;
    private boolean indoorCat;

    public Cat(String name, int age, Owner owner, int id, char sex, boolean neutered, double weight, boolean vaccinated, String favouriteToy, boolean indoorCat) {
        super(name, age, owner, id, sex, neutered, weight, vaccinated);
        this.favouriteToy = favouriteToy;
        this.indoorCat = indoorCat;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public boolean isIndoorCat() {
        return indoorCat;
    }

    public void setIndoorCat(boolean indoorCat) {
        this.indoorCat = indoorCat;
    }
    public double calculateWeeklyFee() {
        double baseRate = 20;
        if (indoorCat) {
            baseRate = baseRate + 5;
        }
        return baseRate * numOfDaysInKennel();

    }
    }
}
