/*-
 *Proyecto: 4FESTRUCTURA
 * Creado por: rigob
 */

public class Reverse {

    public static void invertir(String s) {
        if (s == null || s.length() == 0) {
            return;
        }
        System.out.print(s.charAt(s.length() - 1));
        invertir(s.substring(0, s.length() - 1));
    }

    
    public static void main(String[] args) {
        String ejemplo = "hola";
        invertir(ejemplo);
        System.out.println();
    }
}
