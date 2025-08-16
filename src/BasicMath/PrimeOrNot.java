package BasicMath;

import java.util.Scanner;

class BrutePrime{
    public static boolean prime(int num){
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            return false;
        }
        else{
            return true;
        }
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)

class OptimisedPrime{
    public static boolean primeO(int n){
        int cnt=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i != i){
                    cnt++;
                }
            }
        }
        return cnt <= 2;
    }
}
//Algo:
//1. A prime number has exactly 2 factors → 1 and itself.
//2. We loop only up to √n because divisors always come in pairs (i and n/i).
//3. For every divisor found, we count both i and n/i (but avoid double-counting when i*i = n).
//4. If total factors = 2 →prime, otherwise not prime.

// Time Complexity : O(sqrt(N))
// Space Complexity : O(1)

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("Brute Force : "+BrutePrime.prime(input));
        System.out.println("Optimised approach : "+OptimisedPrime.primeO(input));
    }
}
