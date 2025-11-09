package easy;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number
public class MissingIntegerInArray {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int missingInt = missingIntInArray(arr);
        System.out.println(missingInt);
    }

    static int missingIntInArray(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;

        if (arr[0] != 0) {
            return 0;
        }

        if (arr[arr.length - 1] == arr.length - 1) {
            return arr.length;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                continue;
            } else {
                return arr[i] + 1;
            }
        }

        return -1;
    }
}