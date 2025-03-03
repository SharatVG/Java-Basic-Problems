import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter int Number");
        String number = scanner.nextLine();
        System.out.println("The "+number+"th fibonacci number is " +new FibonacciNumber().getFibonacciNumber(Integer.parseInt(number)));
    }

    public int getFibonacciNumber(int n){
        if(n == 0){
            return n;
        } else if(n == 1) {
            return n;
        } else {
            n = getFibonacciNumber(n-1) +getFibonacciNumber(n-2);
        }
        return n;
    }

}
