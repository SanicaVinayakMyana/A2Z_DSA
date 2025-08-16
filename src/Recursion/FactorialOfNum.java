package Recursion;

class Factorial{
    static int func(int n){
        if(n==0){
            return 1;
        }
        return n* func(n-1);
    }
}
// T.C & S.C: O(N)

public class FactorialOfNum {
    public static void main(String[] args) {
        int fact= Factorial.func(5);
        System.out.println(fact);
    }
}
