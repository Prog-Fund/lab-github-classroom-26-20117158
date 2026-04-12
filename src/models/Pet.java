package models;
import utils.Utilities;

public abstract class Pet {
    private int age;
    private int id = 1000;
    private String name;
    private boolean[] daysAttending = {false, false, false, false, false, false, false};
    private Owner owner = null;

    public Pet(String name, int age, Owner owner, int id) {
        this.name = Utilities.truncateString(name, 30);
        this.age = age;
        this.owner = owner; // needs to validate owner

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean[] isDaysAttending() {
        return daysAttending;
    }

    public void setDaysAttending(boolean[] daysAttending) {
        this.daysAttending = daysAttending;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void checkIn(int day){
        if (day >=0 && day <= 5){ //why is it 5 if theres 7 days??
            daysAttending[day] = true;
        }
    }
    public void checkOut(int day){
        if (day >=0 && day <= 5){
            daysAttending[day] = false;
        }
    }
    public int numOfDaysInKennel(){
        int count = 0;
        for (int i = 0; i <=daysAttending.length; i++){
            if (daysAttending[i]){
                count++;
            }
        }
        return count;
    }

    public abstract double calculateWeeklyFee();



}
