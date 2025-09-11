package Array;

class Brute_SortedRotated{
    public static boolean rotatedSorted(int[] nums){

        int j=0;
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> nums[(i+1)%nums.length]){
               j++;
            }
        }
        if(j>1){
            return false;
        }

        return true;
    }
}
public class SortedOrNot_RotatedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(Brute_SortedRotated.rotatedSorted(nums));
    }
}
