/*-
 *Proyecto: 4FESTRUCTURA
 * Creado por: rigob
 */

public class SumaRecursiva {

    public static int suma(int n) {
        if (n <= 0) return 0;
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("suma(5) = " + suma(5));
    }
}
