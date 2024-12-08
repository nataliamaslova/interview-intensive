package hw6;

/**
 * Задача 2: 40 min
 * Обращение связанного списка (Reverse Linked List):
 * Обратите связанный список.
 *
 * Пример:
 * Вход: 1->2->3->4->5->NULL
 * Выход: 5->4->3->2->1->NULL
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node node5 = new Node("5", null);
        Node node4 = new Node("4", node5);
        Node node3 = new Node("3", node4);
        Node node2 = new Node("2", node3);
        Node node1 = new Node("1", node2);
        printList(node1);
        Node newHead = reverseList(node1);
        printList(newHead);
    }

    public static Node reverseList(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.getNext(); // Сохраняем ссылку на следующий узел
            current.setNext(previous);        // Меняем направление текущей ссылки
            previous = current;               // Передвигаем previous на текущий узел
            current = nextNode;               // Переходим к следующему узлу
        }

        return previous; // Новая глава списка
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
