package Recursion;

class SumNaturalNo{
    public static void func(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        func(i-1,sum+i);
    }
}
// T.C & S.C: O(N)

class SumNaturalNo2{
    static int func2(int n){
        if(n==0){
            return 0;
        }
        return n+func2(n-1);
    }
}
// T.C & S.C: O(N)

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        SumNaturalNo.func(5,0);
        int sum=SumNaturalNo2.func2(5);
        System.out.println(sum);
    }
}
