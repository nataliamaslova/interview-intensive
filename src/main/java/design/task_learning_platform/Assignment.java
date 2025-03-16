package design.task_learning_platform;

public class Assignment {
    private String task;

    public Assignment(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "task='" + task + '\'' +
                '}';
    }
}
