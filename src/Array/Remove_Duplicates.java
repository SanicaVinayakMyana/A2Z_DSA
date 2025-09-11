package Array;
class Brute_removeDuplicate{
    public static int removeDuplicates(int[] nums) {
        int k=0;

        int i=0;
        for(int j=1;j<nums.length;j++){

            if(nums[i]!=nums[j]) {
                nums[i+1]=nums[j];
                i++;
                k++;
            }
        }
        return k+1;
    }
}
// T.C : O(N)
// S.C : O(1)

public class Remove_Duplicates {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,2,3,3,4};
        System.out.println( Brute_removeDuplicate.removeDuplicates(nums));
    }
}

