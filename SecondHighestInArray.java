public class SecondHighestInArray {

    public static void main(String[] args) {
        int[] a = {1,9, 4, 10, 20, 200,10};
        System.out.println(getSecondHighestNumber(a));
    }

    //
    public static int getSecondHighestNumber(int[] a){
        //if the array sorted then just get the array.length -2 value from array
        int highest = 0, secondHighest = 0;
        if(a == null || a.length ==0){
            return 0;
        } else if(a.length == 1){
            return a[0];
        } else if(a.length ==2){
            return (a[0] > a[1]) ? a[1]: a[0];
        } else {
            for(int num :  a){
                if(num > highest){
                    secondHighest = highest;
                    highest = num;
                } else if(num > secondHighest && num != highest){
                    secondHighest = num;
                }
            }
        }
        return secondHighest;
    }
}
