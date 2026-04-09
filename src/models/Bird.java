package models;

public class Bird extends Pet{
    private double wingSpan;
    private double canFly;

    public Bird(String name, int age, Owner owner, int id, double wingSpan, double canFly) {
        super(name, age, owner, id);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getCanFly() {
        return canFly;
    }

    public void setCanFly(double canFly) {
        this.canFly = canFly;
    }
}
