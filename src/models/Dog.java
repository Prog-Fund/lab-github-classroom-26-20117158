package models;

public class Dog extends Mammal{
    private float NONDANGEROUS_DAILY_RATE;
    private boolean dangerousBreed;
    private float DANGEROUS_DAILY_RATE;
    private String breed;

    public Dog(String name, int age, Owner owner, int id, char sex, boolean neutered, double weight, boolean vaccinated, float NONDANGEROUS_DAILY_RATE, boolean dangerousBreed, float DANGEROUS_DAILY_RATE, String breed) {
        super(name, age, owner, id, sex, neutered, weight, vaccinated);
        //this.NONDANGEROUS_DAILY_RATE = NONDANGEROUS_DAILY_RATE;
        this.dangerousBreed = dangerousBreed;
        //this.DANGEROUS_DAILY_RATE = DANGEROUS_DAILY_RATE;
        this.breed = breed;
    }

    public boolean isDangerousBreed() {
        return dangerousBreed;
    }

    public void setDangerousBreed(boolean dangerousBreed) {
        this.dangerousBreed = dangerousBreed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
