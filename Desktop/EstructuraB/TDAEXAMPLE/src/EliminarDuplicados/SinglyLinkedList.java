package EliminarDuplicados;

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


    public void removeDuplicates() {
        Node current = head;
        
        while (current != null && current.next != null) {
            Node runner = current;
            
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    // Eliminar el nodo duplicado
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println(" → null");
    }
}
