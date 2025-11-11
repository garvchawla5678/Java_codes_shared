package Divide_Conquer;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 67, 99, 8, 77 };
        merge_sorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void merge_sorting(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start < end) {
            merge_sorting(arr, start, mid);
            merge_sorting(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] new_arr = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                new_arr[k] = arr[i];
                i++;
                k++;
            } else if (arr[i] > arr[j]) {
                new_arr[k] = arr[j];
                j++;
                k++;
            } else {
                new_arr[k] = arr[i];
                i++;
                k++;
            }
        }
        while (i <= mid) {
            new_arr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            new_arr[k] = arr[j];
            j++;
            k++;
        }
        for (int p = 0; p < new_arr.length; p++) {
            arr[start + p] = new_arr[p];
        }
    }
}
