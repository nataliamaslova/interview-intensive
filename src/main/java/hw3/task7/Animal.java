package hw3.task7;

/**
 * Задача 7: Класс животного и наследование
 * Описание:
 * Создайте классы Animal (животное) и Dog (собака). Используйте принцип наследования:
 * Animal — базовый класс, содержащий:
 * Поля: name (имя животного) и age (возраст).
 * Метод makeSound(), который выводит строку: "Животное издает звук".
 * Dog — подкласс, наследующий Animal:
 * Переопределяет метод makeSound() для вывода строки: "Собака лает".
 * Добавляет метод fetch() с выводом строки: "Собака приносит палку".
 */
public abstract class Animal {
    private String name;
    private int age;

    protected void makeSound() {
        System.out.println("Животное издает звук");
    }
}
