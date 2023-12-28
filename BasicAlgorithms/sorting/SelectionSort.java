package BasicAlgorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[]args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int min_index = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]>arr[min_index]) {
                    min_index=j;
                }
                int temp = arr[min_index];
                arr[min_index] = arr[j];
                arr[j] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
