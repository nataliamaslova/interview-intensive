package lesson5.theory.solid.s;

/**
 * S (Single Responsibility Principle): У класса должна быть
 * только одна причина для изменения.
 * Пример: Класс UserRepository отвечает только за взаимодействие
 * с базой данных.
 */
public class UserRepository {
    public void save(User user) {
        /* сохраняем пользователя */
    }
    public User findById(int id) {
        /* поиск пользователя */
        return new User();
    }
}

