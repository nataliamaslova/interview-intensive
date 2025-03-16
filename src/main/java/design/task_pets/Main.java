package design.task_pets;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();

        Owner oleg = new Owner();
        oleg.add(dog);
        oleg.add(cat);

        oleg.feed(dog);
        oleg.care(dog);

        oleg.feed(cat);
        oleg.care(cat);

        oleg.feedAll();

        oleg.careAll();
    }
}
