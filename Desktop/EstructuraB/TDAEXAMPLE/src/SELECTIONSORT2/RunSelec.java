package SELECTIONSORT2;

import SELECTIONSORT.SelectionSort;

import java.util.Arrays;

public class RunSelec {
    public static void main(String[] args) {

        SelectionSort sorting = new SelectionSort();
        int[] arr = {10,3,5,1,7};
        sorting.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
