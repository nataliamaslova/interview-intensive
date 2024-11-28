package hw3;

import java.util.Objects;

public class Student implements Cloneable {
    private String name;
    private int id;
    private double gpa;

    public Student() {
    }

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Student student = (Student) other;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student anna = new Student("Anna", 101, 3.8);
        Student copyOfAnna = (Student) anna.clone();

        copyOfAnna.setName("Annushka");
        System.out.println(anna.getName());
    }
}
