public class FindAnagramsOfTwoStrings {

    public static void main(String[] args) {

    }

    public static int[] getAnagramByPattern(String inputString, String pattern) {
        char[] patternArray = pattern.toCharArray();
        char[] inputStringArray = inputString.toCharArray();
        for (int i = 0; i < inputStringArray.length; i++) {
            for (int j = 0; j < patternArray.length; j++) {
                if(inputStringArray[i] == patternArray[j]){

                }
            }
        }
    }

    public boolean isAnagram(char[] inputStringArray){

    }
}
