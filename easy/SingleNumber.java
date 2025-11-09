package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[]args) {
        int[] array = {2,2,1};
        int[] arrayOne = {4,1,2,1,2};
        System.out.println(singleNumber(arrayOne));
    }
    public static int singleNumber(int[] nums) {
        return Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(kv -> kv.getValue()==1)
                .findFirst()
                .get()
                .getKey();
    }
}
