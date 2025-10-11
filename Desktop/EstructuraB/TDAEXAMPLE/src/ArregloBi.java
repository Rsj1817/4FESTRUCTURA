/*-
 *Proyecto: Nueva carpeta
 * Creado por: rigob
 */

public class ArregloBi {

    public static void main(String[] args) {

        int[][] arrTest = {
                {1},
                {6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9},
                {2, 4, 8, 9, 10}
        };


        System.out.println("Arreglo original:");
        imprimirArregloBi(arrTest);


        int[][] arrModificado = new int[arrTest.length][];


        for (int i = 0; i < arrTest.length; i++) {

            int tamañoFilaOriginal = arrTest[i].length;
            

            arrModificado[i] = new int[tamañoFilaOriginal + 1];
            

            for (int j = 0; j < tamañoFilaOriginal; j++) {
                arrModificado[i][j] = arrTest[i][j];
            }
            

            int ultimoValor = arrTest[i][tamañoFilaOriginal - 1];
            arrModificado[i][tamañoFilaOriginal] = ultimoValor + 1;
        }


        System.out.println("\nArreglo modificado:");
        imprimirArregloBi(arrModificado);
    }


    public static void imprimirArregloBi(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j]);
                if (j < arreglo[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}
