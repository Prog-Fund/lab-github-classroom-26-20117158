package models;

public class Parrot extends Bird{
    private String vocabularySize = "Amazing";

    public Parrot(String name, int age, Owner owner, int id, double wingSpan, boolean canFly, String vocabularySize) {
        super(name, age, owner, id, wingSpan, canFly);
        this.vocabularySize = vocabularySize;
    }

    public String getVocabularySize() {
        return vocabularySize;
    }

    public void setVocabularySize(String vocabularySize) {
        this.vocabularySize = vocabularySize;
    }

    @Override
    public double calculateWeeklyFee() {
        return numOfDaysInKennel() * 10;
    }
}
