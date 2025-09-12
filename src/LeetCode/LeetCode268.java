package LeetCode;

import java.util.Arrays;

class Brute_268{
    public static int brute268(int []nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
// t.c : O(n log n)
// s.c : O(1)

class Optimal_268{
    public static int optimal268(int []nums){
        int sum=0;
        int total=nums.length*(nums.length+1)/2;
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
        }
        return total-sum;
    }
}
// t.c : O(n)
// s.c : O(1)

public class LeetCode268 {
    public static void main(String[] args) {
        int []nums={3,0,1};
        System.out.println(Brute_268.brute268(nums));
        System.out.println(Optimal_268.optimal268(nums));
    }
}
