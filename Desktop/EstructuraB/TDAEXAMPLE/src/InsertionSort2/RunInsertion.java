package InsertionSort2;

import java.util.Arrays;

public class RunInsertion {
    public static void main(String[] args) {
        InsertionSort sorting = new InsertionSort();
        double[] temps = {23.5, 19.0, 30.2, 21.8, 25.0, 28.4, 18.7};
        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(temps));
        sorting.sort(temps);
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(temps));
        int n = temps.length;
        double min = temps[0];
        double max = temps[n - 1];
        double rango = max - min;
        int ca = n < 3 ? n : 3;
        double[] altas = new double[ca];
        for (int k = 0; k < ca; k++) {
            altas[k] = temps[n - 1 - k];
        }
        int cb = n < 3 ? n : 3;
        double[] bajas = new double[cb];
        for (int k = 0; k < cb; k++) {
            bajas[k] = temps[k];
        }

        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango: " + rango);
        System.out.println("Top " + ca + " altas: " + Arrays.toString(altas));
        System.out.println("Top " + cb + " bajas: " + Arrays.toString(bajas));
    }
}
