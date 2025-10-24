package EjercicioDePracticaListaenlazada;

public class SinglyLinkedList {
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
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public SinglyLinkedList getEvenList() {
        SinglyLinkedList evenList = new SinglyLinkedList();
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                evenList.add(current.data);
            }
            current = current.next;
        }
        return evenList;
    }

    public SinglyLinkedList getOddList() {
        SinglyLinkedList oddList = new SinglyLinkedList();
        Node current = head;
        while (current != null) {
            if (current.data % 2 != 0) {
                oddList.add(current.data);
            }
            current = current.next;
        }
        return oddList;
    }
}
