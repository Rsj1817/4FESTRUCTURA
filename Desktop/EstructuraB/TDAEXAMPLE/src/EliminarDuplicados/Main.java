package EliminarDuplicados;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        

        list.add(5);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);
        

        System.out.println("Lista original:");
        list.printList();
        

        list.removeDuplicates();
        

        System.out.println("\nLista sin duplicados:");
        list.printList();
    }
}
