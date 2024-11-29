package lesson4;

public class Node {
    private String value;
    private Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void printNode() {
        System.out.println("Current node: " + value);
        if (next == null) {
            System.out.println("Next node: none");
        } else {
            System.out.println("Next node:" + next.value);
        }
    }
}
