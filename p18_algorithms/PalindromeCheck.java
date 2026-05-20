package p18_algorithms;

public class PalindromeCheck {

    //write a function that finds if given string a polindrome or not.
    // for example:  KAPAK -> true
    //               KAPI --> false

    
    public static boolean isPalindrome(String a){

        String reverse = "";//we will write here, ewry char reverse
        for (int i=a.length()-1 ; i>=0 ; i--){
            reverse = reverse + a.charAt(i); //charAt method gets the character of index i.
        }

        // Check if the original string is equal to the reversed string.
        if (a.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
     
        String word1 = "KAPAK";
        String word2 = "KAPI";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1)); // true
        System.out.println(word2 + " is palindrome? " + isPalindrome(word2)); // false

    }
}
