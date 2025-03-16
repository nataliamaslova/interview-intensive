package design.task_pets;

public class Cat extends Pet {
    @Override
    public void feed() {
        System.out.println("Cat: wet food");
    }

    @Override
    public void care() {
        System.out.println("Cat: play");
    }
}
