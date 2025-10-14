package MetodoDoubleLinkedList;

public class DoubleLinkedList {

     Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void remove(int value) {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Valor no encontrado");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (current.next == null) {
            current.prev.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println(current);
    }

    public void printBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data);
            current = current.prev;
        }
        System.out.println(current);
        
    }
}
