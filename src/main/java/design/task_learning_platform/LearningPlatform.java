package design.task_learning_platform;

import java.util.ArrayList;
import java.util.List;

public class LearningPlatform {
    private List<Course> courses;

    public LearningPlatform() {
        this.courses = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "LearningPlatform{" +
                "courses=" + courses +
                '}';
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addAssignment(Assignment assignment, String courseName) {
        for (Course course: courses) {
            if (course.getName().equals(courseName)) {
                course.getAssignments().add(assignment);
            }
        }
    }

    public void addTeacher(Teacher teacher, String courseName) {
        for (Course course: courses) {
            if (course.getName().equals(courseName)) {
                course.getTeachers().add(teacher);
            }
        }
    }

    public void addStudent(Student student, String courseName) {
        for (Course course: courses) {
            if (course.getName().equals(courseName)) {
                course.getHomeWorks().add(new HomeWork(student));
            }
        }
    }

    public void study(Student student, Assignment assignment, String courseName) {
        for (Course course: courses) {
            if (course.getName().equals(courseName)) {
                List<HomeWork> homeWorks = course.getHomeWorks();
                for (HomeWork homeWork: homeWorks) {
                    if (homeWork.getStudent().equals(student) &&
                    homeWork.getAssignment() == null) {
                        homeWork.setAssignment(assignment);
                    }
                }
            }
        }
    }

    //
    public void check(Teacher teacher, Assignment assignment, String courseName) {
        for (Course course: courses) {
            if (course.getName().equals(courseName)) {
                List<HomeWork> homeWorks = course.getHomeWorks();
                for (HomeWork homeWork: homeWorks) {
                    if (homeWork.getTeacher() == null && homeWork.getAssignment().equals(assignment)
                            ) {
                        homeWork.setTeacher(teacher);
                        homeWork.setDone(true);
                    }
                }
            }
        }
    }

    public void progress(Student student) {
        for (Course course: courses) {
            for (HomeWork homeWork: course.getHomeWorks()) {
                if (homeWork.getStudent().equals(student)) {
                    System.out.println("Student: " + student + ", Course: " +
                            course.getName() + ", Assignment: " + homeWork.getAssignment() +
                            ", Status: " + homeWork.isDone());
                }
            }
        }
    }
}
