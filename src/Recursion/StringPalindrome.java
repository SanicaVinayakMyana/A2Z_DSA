package Recursion;

class Brute_Palindrome{
    static void check(String input){
        int left=0;
        int right=input.length()-1;
        while(left<right){

            if(input.charAt(left) == input.charAt(right)){
                left++;
                right--;
            }
            else if(input.charAt(left) != input.charAt(right)){
                System.out.println("Not Palindrome");
                break;
            }
            if(left== input.length()/2) {
                System.out.println("Palindrome");
            }
        }

    }
}
// T.C : O(N)
// S.C : O(1)

class Recursion_Palindrome{
    static boolean check2(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return check2(i+1,s);
    }
}
// T.C : O(N)
// S.C : O(1)

public class StringPalindrome {
    public static void main(String[] args) {
        Brute_Palindrome.check("mam");
        boolean ans=Recursion_Palindrome.check2(0,"dog");
        System.out.println(ans);
    }
}
