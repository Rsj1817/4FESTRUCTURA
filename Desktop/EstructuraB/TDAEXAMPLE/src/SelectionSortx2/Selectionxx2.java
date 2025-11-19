package SelectionSortx2;

public class Selectionxx2 {
    public static int[][] separar(int[] arr) {
        int cp = 0;
        int ci = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                cp++;
            } else {
                ci++;
            }
        }
        int[] pares = new int[cp];
        int[] impares = new int[ci];
        int ip = 0;
        int ii = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                pares[ip++] = v;
            } else {
                impares[ii++] = v;
            }
        }
        return new int[][]{pares, impares};
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
