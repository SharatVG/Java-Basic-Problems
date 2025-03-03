import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string to check the  duplicate char");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println("results are" + new StringDuplicateWords().scanForDuplicateChar(input).toString());
    }

    public Map<Character,Integer> scanForDuplicateChar(String inputString){
        Map<Character, Integer> result = new HashMap<>();
        char[] chars = inputString.toCharArray();
        for(char c : chars){
            result.put(c, result.getOrDefault(c, 0) +1);
        }
        return result;
    }
}
