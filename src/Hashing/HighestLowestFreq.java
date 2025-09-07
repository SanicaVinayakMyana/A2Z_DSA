package Hashing;

import java.util.Arrays;
import java.util.HashMap;

class Brute_HLE{
    public static void highestLowestFreq_Brute(int[]arr){
        Arrays.sort(arr);
        int m=arr[arr.length-1];
        int freq[]=new int[m+1];
        for(int i:arr){
            freq[i]++;
        }
        int high=Integer.MIN_VALUE;
        int low=Integer.MAX_VALUE;
        int min=-1;
        int max=-1;
        for(int j=0;j< freq.length;j++) {
            if (freq[j] > 0) {
                if ( freq[j] > high ) {
                    high = freq[j];
                    max=j;
                }
                if (freq[j] < low) {
                    low = freq[j];
                    min=j;
                }
            }
        }
        System.out.println(max);

        System.out.println(min);
    }
}
// T.C : O(n log n) due to sorting
// S.C : O(n)

class Optimised_HLE{
   public static void highestLowestFreq_Optimised(int arr[]) {

       HashMap<Integer, Integer> freq = new HashMap<>();
       for (int j : arr) {
           freq.put(j, freq.getOrDefault(j, 0) + 1);
       }

       int high = Integer.MIN_VALUE;
       int low = Integer.MAX_VALUE;
       int max = -1;
       int min = -1;

       for (int key : freq.keySet()) {
           int f = freq.get(key);
           if (f > high) {
               high = f;
               max = key;  // element with highest frequency
           }
           if (f < low) {
               low = f;
               min = key;  // element with lowest frequency
           }
       }
       System.out.println("Element with highest frequency = " + max + " (" + high + ")");
       System.out.println("Element with lowest frequency = " + min + " (" + low + ")");
   }}
// T.C : O(n)
// S.C : O(n)



    public class HighestLowestFreq {
    public static void main(String[] args) {
        int []arr={2,5,4,7,4,6,3,4,2,5,6};
        Brute_HLE.highestLowestFreq_Brute(arr);
        Optimised_HLE.highestLowestFreq_Optimised(arr);
    }
}
