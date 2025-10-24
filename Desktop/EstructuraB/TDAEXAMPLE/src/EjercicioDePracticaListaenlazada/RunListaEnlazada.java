package EjercicioDePracticaListaenlazada;

public class RunListaEnlazada {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Lista original:");
        list.printList();

        SinglyLinkedList pares = list.getEvenList();
        SinglyLinkedList impares = list.getOddList();

        System.out.println("Lista de pares:");
        pares.printList();

        System.out.println("Lista de impares:");
        impares.printList();
    }

}
