package Array;

class LeftRotateByOne{
    public static void leftRotateByOne(int [ ]nums){
        int temp=nums[0];
        for(int i=0;i<nums.length;i++){

            nums[(i)]=nums[(i+1)% nums.length];
            if(i== nums.length-1){
                nums[nums.length-1]=temp;

            }
        }
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]+" ");

        }

    }
}
// T.C : O(n)
// S.C : O(1)


public class LeftRoatate {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
        LeftRotateByOne.leftRotateByOne(nums);
    }
}
