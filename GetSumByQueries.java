import java.util.Arrays;

public class GetSumByQueries {

    public static void main(String[] args) {
        System.out.println(getSumByQueries(new int[] {1, 3, 5, 6, 4}, new int[][] { {1, 0}, {1, 2}}));
    }

    public static int getSumByQueries(int[] nums, int[][] queries){
        for (int i = 0; i < queries.length; i++) {
            int numIndex = queries[i][1] ,value = queries[i][0];
            nums[numIndex] = nums[numIndex] + value;
        }
        int sum = 0;
        for (int num : nums){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return  sum;
    }

    public static int getSumByQuery(int[] nums, int[][] queries){
        for (int i = 0; i < queries.length; i++) {
            int numIndex = queries[i][1] ,value = queries[i][0];
            nums[numIndex] = nums[numIndex] + value;
        }
        int sum = 0;
        for (int num : nums){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return  sum;
    }
}