package models;

public class Dog extends Mammal{
    final private float NONDANGEROUS_DAILY_RATE = 30;
    private boolean dangerousBreed = false;
    final private float DANGEROUS_DAILY_RATE = 40;
    private String breed;

    public Dog(String name, int age, Owner owner, int id, char sex, boolean neutered, double weight, boolean vaccinated, float NONDANGEROUS_DAILY_RATE, boolean dangerousBreed, float DANGEROUS_DAILY_RATE, String breed) {
        super(name, age, owner, id, sex, neutered, weight, vaccinated);

        this.dangerousBreed = dangerousBreed;

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
    public double calculateWeeklyFee(){
        if (dangerousBreed){
            return numOfDaysInKennel()*DANGEROUS_DAILY_RATE;
        }
        else {
            return numOfDaysInKennel()*NONDANGEROUS_DAILY_RATE;
        }

    }
}
