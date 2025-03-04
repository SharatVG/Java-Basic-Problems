import java.util.Scanner;

public class CheckIfArmstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number");
        String num = scanner.nextLine();
        System.out.println("The Input number is armstrong " + checkIfArmStrongNumber(Integer.parseInt(num), num.length()));
        scanner.close();
    }

    public static boolean checkIfArmStrongNumber(int numb, int numbLength) {
        int original = numb, sum = 0;
        while(numb > 0) {
            System.out.println("before num " + numb);
            sum += Math.pow(numb % 10, numbLength);
            numb = numb / 10;
            System.out.println("after num " + numb);
        }
        return sum == original;
    }

}
