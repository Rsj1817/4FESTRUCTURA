import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        System.out.println("Hello, World!");
        List<String> fruits = new ArrayList<>();

        //agregar elementos a la lista
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mangoo");
        fruits.add("Apple");

        //recorrer
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits.get(2));
        fruits.remove(2);
        System.out.println("lista despues de eliminar: " + fruits);
        System.out.println(fruits.get(2));
        fruits.remove("Apple");
        System.out.println("lista : " + fruits);
        fruits.add("Gripe");
        System.out.println("Nueva lista : " + fruits);
        */

        /*Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");//omision por conjunto

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Banana");
        System.out.println("Set : " + fruits);

        fruits.add("Grape");
        System.out.println("Set : " + fruits);
        */

        /*
        //inicializacion
        Queue<String> fila = new ArrayDeque<>();
        //add
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 3");
        //recorrido
        for (String f : fila) {
            System.out.println(f);
        }
        System.out.println("Atendiendo a cliente: " + fila.poll());
        
        fila.offer("Nuevo Cliente");//agregar alemento a la fila
        fila.poll();//Quitar elemento de la fila
        System.out.println("Fila actual: " + fila);
        System.out.println("Siguiente en la fila: " + fila.peek());// Primero en lista
        */


        Deque<String> libros = new ArrayDeque<>();//lista doblemente enlazada
        //agregar
        libros.push("Libro1");
        libros.push("Libro2");
        libros.push("Libro3");
        //Recorrido
        for(String l : libros){
            System.out.println(l);
        }
        //quitar
        System.out.println("Quitando a: " + libros.pop());
        System.out.println("Stack: " + libros);
        libros.push("Nuevo Libro");
        libros.pop();
        System.out.println("Stack: " + libros);


    }
}
