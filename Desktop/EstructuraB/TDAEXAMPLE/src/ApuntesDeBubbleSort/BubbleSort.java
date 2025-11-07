package ApuntesDeBubbleSort;

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

            if (!swapped) break;
        }

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};
        BubbleSort bs = new BubbleSort();
        bs.sort(numeros);
    }
}
