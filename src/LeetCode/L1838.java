package LeetCode;
//The frequency of an element is the number of times it occurs in an array.
//You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
//Return the maximum possible frequency of an element after performing at most k operations.

//Input: nums = [1,4,8,13], k = 5
//Output: 2
//Explanation: There are multiple optimal solutions:
//        - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
//        - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
//        - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.

import java.util.Arrays;

class Brute1838{
    public static int l1838(int []arr,int k){
        Arrays.sort(arr);
        int freq=1;
        for(int i=arr.length-1;i>=0;i--){
            int m=k;
            int count=1;
            for(int j=i-1;j>=0;j--){
                int c=arr[i]-arr[j];
                if(c<=m){
                    m=m-c;
                    count++;
                }
                else{
                    break;
                }
            }
            freq=Math.max(freq,count);
        }
        return freq;
    }
}
// T.C: O(N^2)
// S.C: O(1)

public class L1838 {
    public static void main(String[] args) {
        int []arr={1,13,4,8};
        System.out.println(Brute1838.l1838(arr,5));
    }

}
