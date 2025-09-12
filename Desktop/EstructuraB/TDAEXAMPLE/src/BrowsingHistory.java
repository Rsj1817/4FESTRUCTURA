/*-
 *Proyecto: 4FESTRUCTURA
 * Creado por: rigob
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class BrowsingHistory {


    public static void main(String[] args) {

        Deque<String> history = new ArrayDeque<>();


        history.push("https://play.google.com/store/games?hl=es_MX");
        history.push("https://www.youtube.com/");
        history.push("https://kahoot.it/");

        System.out.println("Historial ");
        printStack(history);

        //Retrocede una página
        String retrocedida = history.pop();
        System.out.println("\nRetrocediste desde: " + retrocedida);

        //Consulta en qué página estás
        String actual = history.peek();
        System.out.println("Pagina actual: " + actual);

        //Agrega una nueva página
        history.push("https://www.malwarebytes.com/es/");
        System.out.println("\nDespues de visitar:");
        printStack(history);

        //Muestrar todo el contenido
        System.out.println("\nHistorial");
        Iterator<String> desc = history.descendingIterator();
        int i = 1;
        while (desc.hasNext()) {
            System.out.println(i++ + ": " + desc.next());
        }
    }
    private static void printStack(Deque<String> stack) {
        int pos = 1;
        for (String page : stack) {
            System.out.println(pos++ + ": " + page);
        }
    }

}
