package BasicMath;

import java.util.Scanner;

class BrutalForce_ReverseDigit{
    public int reverseB(int num){
        int rev=0;
        while(num!=0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        return rev;
    }
}
// Time Complexity : O(log10 N +1)
// Space Complexity: O(1)
// not efficient for num to be in the range of int.
class Optimised_ReverseDigit{
    public int reverseO(int x){
        int rev=0;
        while(x!=0){
            int temp=x%10;

            x=x/10;
            if(rev > Integer.MAX_VALUE/10 || (rev== Integer.MAX_VALUE/10 && temp>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 ||(rev==Integer.MIN_VALUE/10 && temp <-10)){
                return 0;
            }
            rev=rev*10+temp;
        }
        return rev;
    }
}
public class ReverseDigit {
    public static void main(String[] args) {
        BrutalForce_ReverseDigit trial=new BrutalForce_ReverseDigit();
        Optimised_ReverseDigit trial2= new Optimised_ReverseDigit();
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        int ans=trial.reverseB(input);
        int ans2= trial2.reverseO(input);
        System.out.println(ans);
        System.out.println(ans2);
    }




}
