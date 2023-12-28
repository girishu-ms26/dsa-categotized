package BasicAlgorithms.sorting;

public class MergeSort {
    //define MAX 10
    static int max = 10;
    //navigate through all items
    static int[] a = { 10, 19, 14, 26 };
    static int[] b = new int[a.length+1];
    //merge method
    public static void merging(int low, int mid, int high) {
        int l1, l2, i;
        for (l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
            if (a[l1] <= a[l2])
                b[i] = a[l1++];
            else
                b[i] = a[l2++];
        }
        while (l1 <= mid)
            b[i++] = a[l1++];
        while (l2 <= high)
            b[i++] = a[l2++];
        for (i = low; i <= high; i++)
            a[i] = b[i];
    }
    //sort method
    public static void sort(int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merging(low, mid, high);
        }
    }
    //main
    public static void main(String[] args) {
        int i;
        //Before sorting
        System.out.println("The array elements before sorting: ");
        for (i = 0; i <= a.length-1; i++){
            System.out.print(a[i] + " ");
        }
        //call the sort() method
        sort(0, a.length-1);
        System.out.println();
        //After sorting
        System.out.println("The array elements after sorting: ");
        for (i = 0; i <= a.length-1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
