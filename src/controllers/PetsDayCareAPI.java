package controllers;

import models.Pet;

import java.util.ArrayList;

public class PetsDayCareAPI {
    //private File file
    private ArrayList<Pet> pet = new ArrayList<>();
    private String name;
    private int maxNumberOfPets;

    public PetsDayCareAPI(ArrayList<Pet> pet, int maxNumberOfPets, String name) {
        this.pet = pet;
        this.maxNumberOfPets = maxNumberOfPets;
        this.name = name;
    }

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public int getMaxNumberOfPets() {
        return maxNumberOfPets;
    }

    public String getName() {
        return name;
    }
}
