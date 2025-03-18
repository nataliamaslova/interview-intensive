package design.task_zoo;

public class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Sound: chirps");
    }

    @Override
    void move() {
        System.out.println("Move: flies");
    }
}
