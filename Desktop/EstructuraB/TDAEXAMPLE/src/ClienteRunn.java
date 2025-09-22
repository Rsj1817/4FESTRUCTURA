import java.util.ArrayDeque;
import java.util.Queue;

public class ClienteRunn {

    public static void main(String[]args){

        Queue<Cliente>queue= new ArrayDeque<>();

        Cliente c1=new Cliente(1,"juanito");
        c1.addDoocument("Doc 1");

        Cliente c2 = new Cliente(2,"juenita");
        c2.addDoocument("Doc1 de juanita");

        queue.offer(c2);
        queue.offer(c1);

        System.out.println("g");
    }
}
