package Array;

import java.util.Arrays;

class Brute_SSSL{
    public static void ssslBrute(int[]arr){
        Arrays.sort(arr);
        System.out.println( "Second Smallest : "+arr[1]);
        System.out.println( "Second Largest : "+arr[arr.length-2]);
    }
}
// T.C : O(n log n)
// S.C : O(1)
// can't handle the duplicate values in an array.

class Better_SSSL{
    public static void ssslBetter(int [] arr) {
        int small= Integer.MAX_VALUE;
        int secondSmall= Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            small=Math.min(small,arr[i]);
            large=Math.max(large,arr[i]);
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]<secondSmall && arr[i] != small){
                secondSmall=arr[i];
            }
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        System.out.println( "Second Smallest : "+secondSmall);
        System.out.println( "Second Largest : "+secondLarge);
    }
}
// T.C : O(n), We do two linear traversals in our array i.e traverses two times through the array.
// S.C : O(1)

//int[] arr = {1, 1, 1, 2, 2, 3};

//        ## Step 1: Initialization
//

//      small = +∞
//      second_small = +∞
//      large = -∞
//      second_large = -∞

//        ## Step 2: First loop → find `small` and `large`
//
//          Go element by element:
//
//        * i=0 → arr\[0] = 1 → small = 1, large = 1
//        * i=1 → arr\[1] = 1 → small = 1, large = 1
//        * i=2 → arr\[2] = 1 → small = 1, large = 1
//        * i=3 → arr\[3] = 2 → small = 1, large = 2
//        * i=4 → arr\[4] = 2 → small = 1, large = 2
//        * i=5 → arr\[5] = 3 → small = 1, large = 3
//
//        ✅ After loop 1:
//

//      small = 1
//      large = 3

//        ## Step 3: Second loop → find `second_small` and `second_large`
//
//        * i=0 → arr\[0] = 1
//        `arr[i] != small?` → false → skip
//        `arr[i] != large?` (1 != 3 true, 1 > -∞ true) → second\_large = 1
//
//        * i=1 → arr\[1] = 1 → same as above, no change
//
//      * i=2 → arr\[2] = 1 → same as above, no change
//
//      * i=3 → arr\[3] = 2
//        `arr[i] != small?` (2 != 1 true, 2 < +∞ true) → second\_small = 2
//        `arr[i] != large?` (2 != 3 true, 2 > 1 true) → second\_large = 2
//
//        * i=4 → arr\[4] = 2
//        `second_small` stays 2
//        `second_large` stays 2
//
//        * i=5 → arr\[5] = 3
//        `arr[i] != small?` (3 != 1 true, 3 < 2 false) → no change
//        `arr[i] != large?` (3 != 3 false) → skip
//
//✅ After loop 2:
//

//      second_small = 2
//      second_large = 2

//        ## Step 4: Output

//      Second smallest is 2
//      Second largest is 2

//        ### ⚠️ Issue
//          Because the array had duplicates, the program gave the **same value (2) for second smallest and second largest**.
//
//This happens because the code does not check for distinctness properly — it just ensures the number is not equal to `small` or `large`, but it doesn’t ensure second\_small ≠ second\_large.

class Optimal_SSSL{
    public static void sssl_optimal(int arr[]){
        int small= Integer.MAX_VALUE;
        int secondSmall= Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small ){
                secondSmall=small;
                small=arr[i];
            }
            else if(arr[i]<secondSmall && arr[i] != small){
                secondSmall=arr[i];
            }

            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }
            else if(arr[i]>secondLarge && arr[i] !=large){
                secondLarge=arr[i];
            }
        }
        System.out.println("second smallest : "+ secondSmall);
        System.out.println( "Second Largest : "+secondLarge);
    }
}
// T.C : O(n), Single-pass solution
// S.C : O(1)

public class SecondSmallestSecondLargestElement {
    public static void main(String[] args) {
        int arr[]={2,5,20,6,8,4};
        Brute_SSSL.ssslBrute(arr);
        Better_SSSL.ssslBetter(arr);
        Optimal_SSSL.sssl_optimal(arr);
    }
}
