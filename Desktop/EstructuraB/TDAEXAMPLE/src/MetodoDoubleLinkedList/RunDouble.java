package MetodoDoubleLinkedList;

public class RunDouble {

    public static void main(String[] args) {
        
        DoubleLinkedList list = new DoubleLinkedList();
        list.printForward();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printForward();

        System.out.println("----------imprimir backward----------");
        list.printBackward();

        //tarea
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("\n----------Aqui comienza la tarea----------");
        System.out.println("Lista antes de eliminar:");
        list.printForward();

        list.remove(1);
        list.remove(6);
        list.remove(3);

        System.out.println("Lista después de eliminar:");
        list.printForward();




    }
}
