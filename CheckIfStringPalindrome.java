import java.util.Arrays;

public class CheckIfStringPalindrome {

/*    6. Check if a String or Number is a Palindrome
          Question: Implement a Java function that determines whether a given string or number is a
          palindrome (reads the same forward and backward).*/

    public static void main(String[] args) {
        String inputString = "Sagas";

        CheckIfStringPalindrome checkIfStringPalindrome = new CheckIfStringPalindrome();
        boolean result = checkIfStringPalindrome.checkStringIsPalindrome(inputString);
        System.out.println("the input string "+inputString+ " is " +result);
    }

    public boolean checkStringIsPalindrome(String inputString){
        //char[] inputStringArray = new char[inputString.length()];
        char[] inputStringArray = inputString.toCharArray();
        for(int i = 0 ; i < inputString.length()/2; i++){
            if(inputStringArray[i] != (inputStringArray[inputString.length()-1-i])){
                return false;
            }
        }
        return true;
    }
}
