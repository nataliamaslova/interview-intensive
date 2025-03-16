package live_coding.interview_2;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String address;
    private Designation designation;
    private int age;
    private String department;
    private String email;
    private LocalDate dateOfJoining;

    public Employee(String name, String address, Designation designation,
                    int age, String department, String email, LocalDate date) {
        if (!isValidEmail(email))  {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
        this.name = name;
        this.address = address;
        this.designation = designation;
        this.age = age;
        this.department = department;
        this.email = email;
        this.dateOfJoining = date;
    }

    private static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public String getDetails() {
        return String.format("\nName: %s\nAge: %d\nDesignation: %s\nDepartment: %s\nAddress: %s\nDate of Joining: %s\n",
                name, age, designation, department, address, dateOfJoining);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email))  {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
        this.email = email;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
