import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindIndicesOfTwoNumbersTargetSum {

    public static void main(String[] args) {
        int[] result = getIndicesOfTwoNumberOfTargetSum2(10, new int[]{10,1,4,78,0});
        Arrays.stream(result).forEach(System.out::println);
    }

    //using the for loops
    public static int[] getIndicesOfTwoNumberOfTargetSum1(int target, int ...a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i] + a[j] == target) {
                    return new int[] { i, j};
                }
            }
        }
        return null;
    }

    public static int[] getIndicesOfTwoNumberOfTargetSum2(int target, int ...a){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int result = Math.subtractExact(target, a[i]);
            if(!map.containsKey(result)){
                map.put(a[i], i);
            } else {
                return new int[] {map.get(result), i};
            }
        }
        return null;
    }
}
