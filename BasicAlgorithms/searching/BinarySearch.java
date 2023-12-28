package BasicAlgorithms.searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        // Search a element in the array
        int element = 6;
        // System.out.println(iterativeBinarySearch(list,element));
        int listSize = list.size()-1;
        System.out.println(recursiveBinarySearch(list,0,listSize,element));
    }
    public static int recursiveBinarySearch(List<Integer> list, int length, int listSize, int element) {
        if(listSize >= length) {
            int mid = length + (listSize - length) / 2;
            if(list.get(mid) == element) {
                return mid;
            }
            if(list.get(mid) > element) {
                return recursiveBinarySearch(list,length,mid-1,element);
            }
            return recursiveBinarySearch(list,mid+1,listSize,element);
        }
        return -1;
    }
}
