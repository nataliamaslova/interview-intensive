package hw3.task10.users;

/**
 * Класс User:
 * Поля: id, name, email.
 * Методы: геттеры/сеттеры, displayUserInfo().
 */
public class User {
    protected int id;
    protected String name;
    protected String email;

    public User(int id, String name, String email ) {
        this.email = email;
        this.name = name;
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", email: " + email);
    }
}
