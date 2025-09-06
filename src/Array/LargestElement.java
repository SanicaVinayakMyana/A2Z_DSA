package Array;

class Brute_LargestElement{
    public static int largestElementBrute(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
// T.C : O(N)
// S.C : O(1)

class Recursive_LargestElement{
    public static void largestElementRecursive(int [] arr,int i,int max){
        if(i==arr.length){
            System.out.println(max);
            return;
        }
        if(arr[i]>max){
            max=arr[i];
        }
       largestElementRecursive(arr,i+1,max);
    }
}
// T.C : O(N)
// S.C : O(N)

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={2,5,10,6,7};
        int ans=Brute_LargestElement.largestElementBrute(arr);
        System.out.println(ans);
        Recursive_LargestElement.largestElementRecursive(arr,0,Integer.MIN_VALUE);

    }
}
