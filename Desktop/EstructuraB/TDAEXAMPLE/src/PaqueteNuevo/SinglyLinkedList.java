package PaqueteNuevo;

public class SinglyLinkedList {


    Node head;

    public void add(int data) {
        Node newNode = new Node(data);//Crear nuevo nodo
        if (head == null) {//Verificar si la lista esta vacia
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {//Recorrido de los nodos, hasta encontrar el ultimo
            current = current.next;
        }
        current.next = newNode;//insertar nuevo nodo al final de la lista
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {//Recorrido de los nodos
            if (current.data == data) {//Verificar si el nodo actual contiene el dato buscado
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(int data) {
        if (head == null) {//preguntar si la lista esta vacia
            return;
        }
        if (head.data == data) {//valida que el dato esta en el head
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {//recorrer hasta encontrar el nodo
            current = current.next;
        }

        // Verificar que se encontró el nodo antes de eliminarlo
        if (current.next != null) {
            current.next = current.next.next;//Asignar el siguiente del siguiente
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int countOccurrences(int data) {
        int count = 0;
        Node current = head;
        while (current != null) {//Recorrido de los nodos
            if (current.data == data) {//Verificar si el nodo actual contiene el dato buscado
                count++;
            }
            current = current.next;
        }
        return count;
    }


}
