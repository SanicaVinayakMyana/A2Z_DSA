package BasicMath;

import java.util.Scanner;

class BrutalForce_GCD{
    public int gdc_num(int n1,int n2){
        int gcd=1;
        for(int i=1;i<Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}

// Time Complexity : O(min(n1,n2))
// Space Complexity : O(1)

class Better_GCD{
    public int gdcNum(int n1,int n2){
        int gcd=1;
        for(int i=Math.min(n1,n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;

    }
}

// Time Complexity : O(min(n1,n2))
// Space Complexity : O(1)

class Optimised_GCD {
    public void gcd_Num(int n1, int n2) {
        int large, small;

            if (n1 > n2 && n1 > 0) {
                large = n1;
                small = n2;
            } else {
                large = n2;
                small = n1;
            }
            int diff = large - small;
            if (diff == 0) {
                int ans = small;
                System.out.println(ans);

            }
            if(diff>0){
            gcd_Num(diff, small);}


        }
    }
class Optimised_GCD2 {
    public int gcd_Num2(int n1, int n2) {
        if(n2>n1){
            int temp=n1;
            n1=n2;
            n2=temp;
        }

        if(n2==0){
            return n1;
        }
        return gcd_Num2(n2, n1 % n2);
    }
}
public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        BrutalForce_GCD trial = new BrutalForce_GCD();
        Better_GCD trial2= new Better_GCD();
        Optimised_GCD trial3=new Optimised_GCD();
        Optimised_GCD2 trial4= new Optimised_GCD2();
        Scanner sc = new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int gcd= trial.gdc_num(input1,input2);
        int gcd_better=trial2.gdcNum(input1,input2);
        int gcd_op2= trial4.gcd_Num2(input1,input2);
        trial3.gcd_Num(input1,input2);
        System.out.println(gcd);
        System.out.println(gcd_better);
        System.out.println(gcd_op2);

    }

}
