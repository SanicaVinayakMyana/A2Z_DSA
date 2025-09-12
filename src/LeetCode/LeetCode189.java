package LeetCode;

class Brute_leetcode189{

}

class Optimal_189{
    public static int[] rotateArray189(int []nums,int k){
        int n= nums.length;
        k=k%nums.length;

        reverseArray189(nums,0,k-1 );
        reverseArray189(nums,k, nums.length-1);
        reverseArray189(nums,0, nums.length-1);
        return nums;
    }
    public static void reverseArray189(int []nums, int start, int end){

        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
}
// t.c : O(n)
// s.c : O(1)

public class LeetCode189 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int []arr=Optimal_189.rotateArray189(nums,3);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
