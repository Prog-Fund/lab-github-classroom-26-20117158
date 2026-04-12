package models;

abstract public class Bird extends Pet{
    private double wingSpan = 3;
    private boolean canFly = false;

    public Bird(String name, int age, Owner owner, int id, double wingSpan, boolean canFly) {
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

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
