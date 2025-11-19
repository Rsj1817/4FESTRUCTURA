package SelectionSortx2;

import java.util.Arrays;
import java.util.Scanner;

public class RunSelecx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingresa los números");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] split = Selectionxx2.separar(arr);
        int[] pares = split[0];
        int[] impares = split[1];
        Selectionxx2.selectionSort(pares);
        Selectionxx2.selectionSort(impares);
        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(arr));
        System.out.println("Arreglo de pares ordenado");
        System.out.println(Arrays.toString(pares));
        System.out.println("Arreglo de impares ordenado");
        System.out.println(Arrays.toString(impares));
    }
}
