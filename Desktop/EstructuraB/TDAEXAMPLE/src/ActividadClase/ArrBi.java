package ActividadClase;

public class ArrBi {

    public static void main(String[] args) {

        int[][] arregloEntrada = {
                {1},
                {6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9},
                {2, 4, 8, 9, 10}
        };

        int[][] arregloSalida = new int[arregloEntrada.length][];

        for (int i = 0; i < arregloEntrada.length; i++) {
            int[] fila = arregloEntrada[i];
            int longitudNueva = fila.length + 1;
            arregloSalida[i] = new int[longitudNueva];

            System.arraycopy(fila, 0, arregloSalida[i], 0, fila.length);

            int primero = 0;
            int ultimo = 0;
            for (int k = 0; k < fila.length; k++) {
                if (k == 0) primero = fila[k];
                if (k == fila.length - 1) ultimo = fila[k];
            }

            if (fila.length % 2 == 0) {
                arregloSalida[i][longitudNueva - 1] = primero + ultimo;
            } else {
                arregloSalida[i][longitudNueva - 1] = 0;
            }
        }

        System.out.println("Salida:");
        for (int[] fila : arregloSalida) {
            System.out.print("{");
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j]);
                if (j < fila.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");


        }


    }
}