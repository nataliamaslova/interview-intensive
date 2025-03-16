package design.task_zoo;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Animal> animals;

    public Manager() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showALl() {
        for(Animal animal: animals) {
            animal.move();
            animal.sound();
        }
    }
}
