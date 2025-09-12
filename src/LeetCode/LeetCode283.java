package LeetCode;

class Brute_283{
    public static void moveZeroes283(int []nums){
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
            if(nums[i]!=0){
                i++;
            }
        }
        for(int m=0;m<nums.length;m++){
            System.out.println(nums[m]+" ");
        }
    }
}
// t.c : O(n)
// s.c : O(1)

class Optimal_283{
    public static void optimalMakeZeroes283(int[]nums){

        for(int m=0;m<nums.length;m++){
            System.out.println(nums[m]+" ");
        }
    }
}
public class LeetCode283 {
    public static void main(String[] args) {
        int []nums={1,0,2,3,0,4,1};
        Brute_283.moveZeroes283(nums);

    }
}
