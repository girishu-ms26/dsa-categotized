package BasicAlgorithms.searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[]args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Search a element in the array
        int element = 6;
//         System.out.println(iterativeBinarySearch(list,element));
        int listSize = list.size()-1;
        System.out.println(recursiveBinarySearch(list,0,listSize,element));
    }

//    private static int iterativeBinarySearch(List<Integer> list, int element) { O(N)
//        int mid = list.size() / 2;
//        if(list.get(mid) == element) {
//            return mid;
//        }
//        if(list.get(mid) > element) {
//            for(int i=0;i<mid;i++) {
//                if(list.get(i)==element) {
//                    return i;
//                }
//            }
//        }
//        if(list.get(mid) < element) {
//            for(int i=mid;i<list.size();i++) {
//                if(list.get(i)==element) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
    public static int recursiveBinarySearch(List<Integer> list, int length, int listSize, int element) {
        if(listSize >= length) { // O(log N)
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
