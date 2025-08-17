package Recursion;

//LeetCode Prblm answer.
class Solution_Fibo {
    public int fib(int n) {
        int prev=0;
        int curr=1;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{
            for(int i=2;i<=n;i++){
                int sum=prev+curr;
                prev=curr;
                curr=sum;
            }}
        return curr;
    }
}
// T.C : O(N)
// S.C : O(1)

class Fibo_Recursive{
    static void series(int n,int zero,int one,int temp){
        int curr=0;
        if(zero==0 && one==1){
            System.out.print(zero+ " "+ one);
        }
        if(n==temp+1){
            return;
        }
        curr=zero+one;
        System.out.print(" "+curr);
        series(n,one,curr,temp+1);
    }
}
// T.C : O(N)
// S.C : O(N)

public class FibonacciSeries {
    public static void main(String[] args) {
        Fibo_Recursive.series(5,0,1,0);
    }
}
