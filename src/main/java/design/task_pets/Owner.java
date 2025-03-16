package design.task_pets;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private List<Pet> pets;

    public Owner() {
        this.pets = new ArrayList<>();
    }

    public void add(Pet pet) {
        pets.add(pet);
    }

    public void feed(Pet pet) {
        pet.feed();
    }

    public void care(Pet pet) {
        pet.care();
    }

    public void careAll() {
        for(Pet pet: pets) {
            pet.care();
        }
    }
    public void feedAll() {
        for(Pet pet: pets) {
            pet.feed();
        }
    }
}
