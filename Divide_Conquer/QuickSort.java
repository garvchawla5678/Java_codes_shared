package Divide_Conquer;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 109, 1, 3, 67, 99, 8, 77, 5 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        Random rn = new Random();
        if (start < end) {
            int pivot = rn.nextInt(end - start + 1) + start;
            int position = partition(arr, start, end, pivot);
            quickSort(arr, start, position - 1);
            quickSort(arr, position + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end, int pivot) {
        int temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;

        int item = arr[end];
        int idx = start;
        for (int j = start; j < end; j++) {
            if (arr[j] <= item) {
                int k = arr[j];
                arr[j] = arr[idx];
                arr[idx] = k;
                idx++;
            }
        }
        temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
