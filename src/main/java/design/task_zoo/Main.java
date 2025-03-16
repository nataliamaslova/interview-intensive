package design.task_zoo;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        Manager peter = new Manager();
        peter.addAnimal(elephant);
        peter.addAnimal(bird);
        peter.showALl();
    }
}
