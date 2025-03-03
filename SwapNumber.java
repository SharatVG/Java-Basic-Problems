public class SwapNumber {
    public static void main(String[] args) {
        new SwapNumber().swapIntValues(1, 2);
    }

    public void swapIntValues(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(String.format("after swap a is %d, b is %d", a, b));
    }
}
