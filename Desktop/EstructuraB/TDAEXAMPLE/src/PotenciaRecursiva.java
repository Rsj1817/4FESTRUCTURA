/*-
 *Proyecto: 4FESTRUCTURA
 * Creado por: rigob
 */

public class PotenciaRecursiva {

    public static long potencia(long a, int b) {
        if (b < 0) throw new IllegalArgumentException("");
        if (b == 0) return 1;
        return a * potencia(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println("(2, 3) = " + potencia(2, 3));
    }




}
