import java.util.Arrays;

public class RemoveWhiteSpaceFromString {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpacesFromString("Sharat went to Hospital today"));
    }

    //using split
    public static String removeWhiteSpacesFromString(String inputValue){
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = inputValue.split(" ");
        Arrays.stream(words).forEach(System.out::println);
        Arrays.stream(words).forEach(a -> stringBuilder.append(a));
        return stringBuilder.toString();
    }

    //using charAT
    public String removeWhitespaces(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
