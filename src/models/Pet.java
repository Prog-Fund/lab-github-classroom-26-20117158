package models;

public abstract class Pet {
    private int age;
    private int id;
    private String name;
    private boolean daysAttending;
    private Owner owner;

    public Pet(String name, int age, Owner owner, int id) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.id = id;
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

    public boolean isDaysAttending() {
        return daysAttending;
    }

    public void setDaysAttending(boolean daysAttending) {
        this.daysAttending = daysAttending;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
