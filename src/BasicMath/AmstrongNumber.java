package BasicMath;


import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int ams=0;
        int x=input;
        int digits=(int)(Math.log10(input)+1);
        while(input!=0){
            int temp=input%10;
            ams=ams+(int)Math.pow(temp,digits);
            input=input/10;
        }
        if(x==ams){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

// Time Complexity : O(log10 N + 1)
// Space Complexity : O(1)