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


//Leetcode problem solution for:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
class  Solution {
public boolean isPalindrome(String s) {
    if(s.length() == 0){
        return true;
    }
    int start=0;
    int last=s.length()-1;
    while(start<=last){
        char currFirst=s.charAt(start);
        char currLast=s.charAt(last);
        if(!Character.isLetterOrDigit(currFirst)){
            start++;
        }
        else if(!Character.isLetterOrDigit(currLast)){
            last--;
        }
        else{
            if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                return false;
            }
            start++;
            last--;
        }

    }

    return true;
}
}

class Solution_Recursive {
    static boolean isPalindrome(String s, int start, int last) {
        // Base case: if pointers cross → all checks done
        if (start >= last) {
            return true;
        }

        char currFirst = s.charAt(start);
        char currLast = s.charAt(last);

        // Skip non-alphanumeric characters
        if (!Character.isLetterOrDigit(currFirst)) {
            return isPalindrome(s, start + 1, last);
        }
        if (!Character.isLetterOrDigit(currLast)) {
            return isPalindrome(s, start, last - 1);
        }

        // Compare characters
        if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
            return false;
        }

        // Recurse inward
        return isPalindrome(s, start + 1, last - 1);
    }
}
// T.C : O(N)
// S.C : O(N)


// Tail recursion:
//boolean isPalindromeTail(int start, int end, String s) {
//    if (start >= end) {
//        return true;
//    }
//    if (!Character.isLetterOrDigit(s.charAt(start))) {
//        return isPalindromeTail(start + 1, end, s);   // last action
//    }
//    if (!Character.isLetterOrDigit(s.charAt(end))) {
//        return isPalindromeTail(start, end - 1, s);   // last action
//    }
//    if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
//        return false;  // decision made, no further recursion
//    }
//    // recursive call is the last thing done
//    return isPalindromeTail(start + 1, end - 1, s);
//}

public class StringPalindrome {
    public static void main(String[] args) {
        Brute_Palindrome.check("mam");
        boolean ans=Recursion_Palindrome.check2(0,"mam");
        System.out.println(ans);
        String str="abcacba";
        System.out.println(Solution_Recursive.isPalindrome(str,0,str.length()-1));

    }
}
