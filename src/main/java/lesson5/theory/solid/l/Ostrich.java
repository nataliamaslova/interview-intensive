package lesson5.theory.solid.l;

/**
 * L (Liskov Substitution Principle): Объекты подклассов
 * должны заменять объекты базового класса без ошибок.
 */
public class Ostrich extends Bird {
    @Override
    public void fly() {
        {
            throw new UnsupportedOperationException();
        }
    }
    // Нарушение LSP
}
