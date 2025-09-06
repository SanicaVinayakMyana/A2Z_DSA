package Hashing;

import java.util.Arrays;
import java.util.HashMap;

class UsingLoops{
    public static void hashing_usingLoops(int[]arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int[]freq=new int[max+1];
        for (int k : arr) {
            freq[k]++;
        }
        for (int j : freq) {
            System.out.print(j + " ");
        }
    }
}
// T.C : O(N)
// S.C : O(1)

class UsingHshMap{
    public static void usingMap(int []arr){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        System.out.println(freq);
    }
}
// T.C : O(N)- average case, O(n^2)- Worst case
//Internally, HashMap then takes that hashCode and compresses it into a bucket index (usually using bit-masking with the table size, which is a power of 2).
//Even though your example didn’t explicitly use the division method, Java internally hashes + compresses keys. The theoretical worst case (all keys collide) is always possible, so we mention it.
// S.C : O(N)

public class FreqOfElement {
    public static void main(String[] args) {
        int [] arr={2,5,8,10,3,2,8,10};
        UsingLoops.hashing_usingLoops(arr);
        UsingHshMap.usingMap(arr);
    }
}
