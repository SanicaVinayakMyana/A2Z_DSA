package Recursion;

import java.util.Arrays;
import java.util.Collections;

class ReverseArray {
    static void reverse(int []arr, int left,int right){
       if(left<=right) {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           reverse(arr, left + 1, right - 1);
       }

    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)


class NewApproach{
    static void reverse2(Integer arr[]){
        Collections.reverse(Arrays.asList(arr));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)


public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Integer[] arr2={5,4,3,2,1};
        ReverseArray.reverse(arr,0,4);
        NewApproach.reverse2(arr2);
    }
}
