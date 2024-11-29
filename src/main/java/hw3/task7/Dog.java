package hw3.task7;

public class Dog extends Animal {
    @Override
    protected void makeSound() {
        System.out.println("Собака лает");;
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }
}
