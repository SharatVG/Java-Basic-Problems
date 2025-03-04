import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualCharacterFrequency {

    public static void main(String[] args) {
        System.out.println(checkEqualCharacterFrequency("aabbcc"));
        System.out.println(checkEqualCharacterFrequency("aabcc"));
    }

    public static boolean checkEqualCharacterFrequency(String inputString){
        char[] chars = inputString.toCharArray();
        Map<Character, Integer> result = new HashMap<>();
        for (char charValue : chars){
            result.put(charValue, result.getOrDefault(charValue, 0) +1);
        }

        Set<Integer> value = new HashSet<Integer>(result.values());

        return value.size() == 1;
    }
}


