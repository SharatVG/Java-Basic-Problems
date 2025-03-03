import java.util.HashMap;
import java.util.Map;

public class CountWords {

    //Count no of words in a given string. there maybe duplicates
    public static void main(String[] args) {
        System.out.println(new CountWords().getWordCount("Hello a Word Text A a").toString());
    }

    public Map<String, Integer> getWordCount(String inputString){
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] wordsArray = inputString.split(" ");
        for(String word : wordsArray){
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
}
