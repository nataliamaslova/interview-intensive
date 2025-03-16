package design.task_learning_platform;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private List<Teacher> teachers;
    private List<Assignment> assignments;
    private List<HomeWork> homeWorks;

    public Course(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.homeWorks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public List<HomeWork> getHomeWorks() {
        return homeWorks;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                ", assignments=" + assignments +
                ", homeWorks=" + homeWorks +
                '}';
    }
}
