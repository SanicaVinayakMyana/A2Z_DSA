package Array;

class Brute_SortedOrNot{
    public static boolean sortedOrNot_Brute(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;i++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
// T.C : O(n^2)
// S.C : O(1)

class Optimal_SortedOrNot{
    public static boolean sortedOrNot_Optimal(int []arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
// T.C : O(n^2)
// S.C : O(1)

public class SortedOrNot {
    public static void main(String[] args) {
        int arr[]={2,5,10,6,4,8};
        boolean ans= Brute_SortedOrNot.sortedOrNot_Brute(arr);
        System.out.println(ans);
        System.out.println(Optimal_SortedOrNot.sortedOrNot_Optimal(arr));
    }
}
