package PaqueteNuevo;

public class Principal {

    public static void main(String[] args) throws Exception {

        SinglyLinkedList list = new SinglyLinkedList();

        list.printList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("-------------------------------");
        list.printList();
        list.remove(3);
        System.out.println("-------------------------------");
        list.printList();

        int ocurrencias = list.countOccurrences(2);
        System.out.println("Ocurrencias de 2: " + ocurrencias);


    }
}