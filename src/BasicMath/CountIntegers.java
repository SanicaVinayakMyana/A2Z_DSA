package BasicMath;



import java.util.Scanner;

class BrutalForce{
    public int cnttInteger(int num){
        int count=0;
        while(num!=0){
            count= count+1;
            num= num/10;
        }
        return count;
    }
}
// Time Complexity :  O(log10N + 1)
// In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
// Space Complexity : O(1) as only a constant amount of additional memory for the counter regardless of size of the input number.

class Optimised {
    public int cntInteger(int num){
        int count= (int)(Math.log10(num)+1);
        return count;
    }
}

// Time Complexity: O(1)as simple arithmetic operations in constant time are computed on integers.
// Math.log10(n) ≈ Math.log(n) / Math.log(10)
// Space Complexity : O(1)as only a constant amount of additional memory for the count variable regardless of size of the input number.

public class CountIntegers {
    public static void main(String[] args) {
        BrutalForce trial1=new BrutalForce();
        Optimised trial2= new Optimised();
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count= trial1.cnttInteger(input);
        int count2= trial2.cntInteger(input);

        System.out.print(count);
        System.out.println(count2);
    }

}
