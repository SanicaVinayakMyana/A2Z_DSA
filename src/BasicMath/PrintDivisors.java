package BasicMath;

import java.util.Scanner;

// Given an integer N, return all divisors of N.

public class PrintDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        for(int i=1;i<input;i++){
            if(input%i == 0){
                System.out.print(i + " ");
            }
        }

    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)