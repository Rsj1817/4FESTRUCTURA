
package EjercicioDePractica1Queue;

public class RunQueueP {

    public static void main(String[] args) throws Exception {
        ArrayQueue<Customer> queue = new ArrayQueue<>();

        queue.offer(new Customer(1, "Ana"));
        queue.offer(new Customer(2, "Luis"));
        queue.offer(new Customer(3, "Maya"));
        queue.offer(new Customer(4, "Jose"));
        queue.offer(new Customer(5, "Sofia"));
        queue.offer(new Customer(6, "Carlos"));

        System.out.println("Antes de invertir:");
        queue.print();

        int antes = queue.getSize();

        ArrayQueue<Customer> reversed = queue.reverse();

        System.out.println("Después de invertir:");
        reversed.print();

        System.out.println("Elementos antes = " + antes + ", elementos después = " + reversed.getSize());
    }
}
