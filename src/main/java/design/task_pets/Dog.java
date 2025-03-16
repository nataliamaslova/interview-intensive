package design.task_pets;

public class Dog extends Pet {

    @Override
    public void feed() {
        System.out.println("Dog: dry food");
    }

    @Override
    public void care() {
        System.out.println("Dog: walk");
    }
}
