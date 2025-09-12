package LeetCode;

class Optimal_485{
    public static int optimal485(int []nums){
        int max=0;

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }

        return max;
    }
}
//t.c : O(n)
// s.c : O(1)

public class LeetCode485 {
    public static void main(String[] args) {
        int[]nums={1,1,0,1,1,1};
        System.out.println(Optimal_485.optimal485(nums));
    }
}
