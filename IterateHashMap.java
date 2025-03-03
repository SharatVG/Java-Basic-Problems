import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("firstName", "abc");
        inputMap.put("lastName", "def");
        IterateHashMap iterateHashMap = new IterateHashMap();

        iterateHashMap.iterateUsingForLoop(inputMap);
        iterateHashMap.iterateUsingEnhancedForLoop(inputMap);
        iterateHashMap.iterateUsingWhileLoop(inputMap);
    }

    //for loops
    public void iterateUsingForLoop(Map<String, String> inputMap) {
        Iterator<Map.Entry<String, String>> iterator = inputMap.entrySet().iterator();
        for (; iterator.hasNext(); ) { // No need for initialization or update expressions
            Map.Entry<String, String> entry = iterator.next(); // Correctly retrieve next entry
            System.out.println("For Loops-----------------------");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    //while loops

    public void iterateUsingWhileLoop(Map<String, String> inputMap) {
        Iterator<Map.Entry<String, String>> iterator = inputMap.entrySet().iterator();
        while (iterator.hasNext()) { // No need for initialization or update expressions
            Map.Entry<String, String> entry = iterator.next(); // Correctly retrieve next entry
            System.out.println("For while loops-----------------------");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void iterateUsingEnhancedForLoop(Map<String, String> inputMap) {
        for (Map.Entry<String, String> entry : inputMap.entrySet()){
            System.out.println("EnhancedForLoop-----------------------");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
