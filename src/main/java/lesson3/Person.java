package lesson3;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Person person = (Person) other;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    //    @Override
//    public boolean equals(Object other) {
//        if (this == other) return true;
//        if (other == null || getClass() != other.getClass()) return false;
//        Person person = (Person) other;
//        return this.age == person.age &&
//                this.firstName.equals(person.firstName) &&
//                this.lastName.equals(person.lastName);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
//        return 31 * firstName.hashCode() + lastName.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("John", "Doe", 30);
        System.out.println(person1);
        System.out.println("Equals: " + person1.equals(person2));
        System.out.println("HashCode of person1: " + person1.hashCode());
        System.out.println("HashCode of person2: " + person2.hashCode());
    }
}
