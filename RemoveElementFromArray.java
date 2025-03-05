import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        Arrays.stream(removeIntArray(new int[]{10, 3, 30, 22, 10}, 10)).forEach(System.out::println);
        System.out.println("length of an array" + getNewLengthOfRemovedArray(new int[]{10, 3, 30, 22, 10}, 10));
    }

    //This return array with by removing them and shifting the rest of the values
    public static int[] removeIntArray(int[] inputArray, int value) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == value) {
                if (i != inputArray.length - 1) {
                    inputArray[i] = inputArray[i + 1];
                    for (int j = i + 1; j < inputArray.length; j++) {
                        if (j == inputArray.length - 1) {
                            inputArray[j] = 0;
                        } else {
                            inputArray[j] = inputArray[j + 1];
                        }
                    }
                }

            }
        }
        return inputArray;
    }

    public static int  getNewLengthOfRemovedArray(int[] inputArray, int value){
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] != value){
                counter++;
            }
        }
        return counter;
    }

}

