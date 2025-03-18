package design.task_zoo;

/**
 * Зоопарк
 *  В зоопарке есть разные животные, каждое из которых издаёт
 *  уникальные звуки и передвигается своим способом.
 *  Например, слон трубит и ходит, а птица чирикает и летает.
 *  Нужно спроектировать систему, которая может работать с любыми животными,
 *  добавлять их в зоопарк, а затем показывать, как они издают звуки и передвигаются.
 *
 *  Сущности: животное: птица, слон; зоопарк
 *  Действия: издать звук (птица: чирикать, слон: трубить), двигаться (птица: летать, слон: ходить)
 *  Связи: где действия: внутри класса родителя или интерфейса?
 *
 *  Абстрактный класс - наследование + полиморфизм для методов
 *  Интерфейс - полиморфизм
 *  Родитель один, интерфейсов много
 *
 *  Действие летать может быть как у птиц, так и у самолета, так и у ракеты
 *  Bird implements Flyable
 *  Plane implements Flyable
 *
 *  Animal {
 *     sound();
 *     move();
 *  }
 *
 *  Bird extends Animal {
 *  }
 *
 *  Классы: свойства (поля) и действия (методы):
 *   Животное - нет свойств
 *      издать звук, передвигаться
 *   Слон - нет свойств
 *   Птица - нет свойств
 *   Зоопарк - животные, методы:
 *      добавить животное (животное),
 *      заставить животное издать звук {
 *          animal.sound()
 *          }
 *      заставить животное двигаться {
 *          animal.move()
 *          }
 */
public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        Manager peter = new Manager();
        peter.addAnimal(elephant);
        peter.addAnimal(bird);
        peter.showAll();
    }
}
