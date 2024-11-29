package lesson4;

public class ReverseList {
    public  static void main(String[] args) {
        Node node = new Node("01", null);
        Node node2 = new Node("02", node);
        Node node3 = new Node("03", node2);

        System.out.println("Исходный список:");
        printList(node3);

        revertList(node3);

        System.out.println("\nРазвернутый список:");
        printList(node);
    }


    public static void revertList(Node head) {
        Node prev = null; // Предыдущий узел
        Node current = head; // Текущий узел
        Node next = null; // Следующий узел

        while (current != null) {
            next = current.getNext(); // Сохраняем следующий узел
            current.setNext(prev); // Разворачиваем ссылку
            prev = current; // Двигаем указатель `prev` вперед
            current = next; // Двигаем указатель `current` вперед
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            current.printNode();
            current = current.getNext();
        }
    }

}
