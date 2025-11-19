package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class RunBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingresa los números");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(arr));
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[n - 1];
        int dif = max - min;
        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor máximo: " + max);
        System.out.println("Diferencia: " + dif);
    }
}
