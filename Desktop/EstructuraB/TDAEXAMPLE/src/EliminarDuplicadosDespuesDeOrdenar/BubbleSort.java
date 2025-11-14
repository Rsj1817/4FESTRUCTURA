package EliminarDuplicadosDespuesDeOrdenar;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public int[] eliminarDuplicados(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int contadorUnicos = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                contadorUnicos++;
            }
        }

        int[] sinDuplicados = new int[contadorUnicos];
        sinDuplicados[0] = arr[0];
        int indiceNuevo = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                sinDuplicados[indiceNuevo] = arr[i];
                indiceNuevo++;
            }
        }

        return sinDuplicados;
    }

    public void imprimirArreglo(String mensaje, int[] arr) {
        System.out.println(mensaje + " " + Arrays.toString(arr));
    }
}
