package BasicMath;

import java.util.Scanner;

class BrutalForce_Palindrome{
    public boolean reverseB(int num){
        int x=num;
        int rev=0;
        while(num!=0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }
}

// Time Complexity : O(log10 N + 1)
// Space Complexity : O(1)

public class PalindromeOrNot {
    public static void main(String[] args) {
        BrutalForce_Palindrome trial= new BrutalForce_Palindrome();
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        boolean ans=trial.reverseB(input);
        System.out.println(ans);
    }

}
