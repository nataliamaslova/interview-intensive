package design.task_learning_platform;

public class Main {
    public static void main(String[] args) {
        Course java = new Course("Java");
        Student petya = new Student("Petya", "Petrov");
        Teacher teacher = new Teacher("Michail", "Smirnov");
        Assignment assignment1 = new Assignment("Task 1");
        Assignment assignment2 = new Assignment("Task 2");
        LearningPlatform learningPlatform = new LearningPlatform();

        learningPlatform.addCourse(java);
        learningPlatform.addAssignment(assignment1, java.getName());
        learningPlatform.addAssignment(assignment2, java.getName());
        learningPlatform.addTeacher(teacher, java.getName());
        learningPlatform.addStudent(petya, java.getName());
        learningPlatform.study(petya, assignment1, java.getName());
        learningPlatform.check(teacher, assignment1, java.getName());
        learningPlatform.progress(petya);

        System.out.println(learningPlatform);
    }
}
