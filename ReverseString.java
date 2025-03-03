public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString1("CACDCAC"));
        System.out.println(reverseString.reverseString2("Sharat"));
    }

    //using for loops to get each char from the last index and creating a new String
/*    Time Complexity (O(n²))
        You are using a loop that runs n times (where n is the length of inputString).
        Inside the loop, you are adding one character at a time to reverseValue.
        In Java, Strings are immutable, meaning every time you do reverseValue += ..., a new String is created, and all previous characters are copied over.
        This copying takes O(n) time in the worst case, and since we do it n times, the total time complexity becomes O(n²) (which is slow for large strings).
        Example: If inputString = "Hello", here’s what happens:
                "H"
                "eH"
                "leH"
                "lleH"
                "olleH"
        Each step creates a new string and copies all characters.
    Space Complexity (O(n)) :
        You store the reversed string in reverseValue, which takes O(n) space because it holds all characters of inputString.
        Other small variables (i) take only O(1) space.
            Overall, O(n) space is used.*/
    //Method - 1:   using for loops to get each char from the last index and creating a new String
    public String reverseString1(String inputString) {
        String reverseValue = "";
        for (int i = inputString.length(); i > 0; i--) {
            reverseValue += inputString.charAt(i - 1);
        }
        return reverseValue;
    }

/*    Time Complexity Analysis
        Converting the string to a char[] → O(n)
        Swapping characters using a loop → O(n/2)
        Since we swap only half the elements, it’s still O(n) (constants like 1/2 are ignored in Big-O notation).
        Converting char[] back to a String → O(n)
        Total Time Complexity:
                O(n) + O(n/2) + O(n) = O(n)
    This is much better than O(n²) in your previous approach!

    Space Complexity Analysis
        The char[] array takes O(n) space.
        Other small variables (left, right, temp) take O(1) space.
                The final string conversion (new String(chars)) also takes O(n) space.
        Total Space Complexity:
                O(n) (because we need to store the modified string).
                This is the best we can do for a problem where we return a new string.*/
    //Method - 1:   using for loops to get each char from the last index and creating a new String
    public String reverseString2(String inputString) {
        char[] chars = inputString.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
