package design.task_learning_platform;

public class HomeWork {
    private boolean isDone;
    private Assignment assignment;
    private Student student;
    private Teacher teacher;

    public HomeWork(Student student) {
        this.isDone = false;
        this.assignment = null;
        this.student = student;
        this.teacher = null;
    }

    public boolean isDone() {
        return isDone;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "isDone=" + isDone +
                ", assignment=" + assignment +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
