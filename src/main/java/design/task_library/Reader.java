package design.task_library;

public class Reader {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                '}';
    }
}
