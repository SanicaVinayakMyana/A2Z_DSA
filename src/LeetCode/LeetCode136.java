package LeetCode;

import java.util.HashMap;

class HashMap_SingleNUmber136{
    public static int hashMap136(int []nums){
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for (int key : freq.keySet()) {
            if (freq.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}
// Time Complexity (T.C)	O(n)
// Space Complexity (S.C)	O(n)


class XOR_SingleNumber136{
    public static int xor136(int []nums){
        int xor=0;
         for(int i=0;i<nums.length;i++){
             xor=xor^nums[i];
         }
         return xor;
    }
}
// Time Complexity (T.C)	O(n)
// Space Complexity (S.C)	O(1)

public class LeetCode136 {
    public static void main(String[] args) {
        int nums[]={2,2,1};
        System.out.println(HashMap_SingleNUmber136.hashMap136(nums));
        System.out.println(XOR_SingleNumber136.xor136(nums));
    }
}
