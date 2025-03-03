public class PrimeNumberCheck {

    public static void main(String[] args) {
        PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();

        System.out.println(primeNumberCheck.checkIfPrime(0));
        System.out.println(primeNumberCheck.checkIfPrime(2));

        System.out.println(primeNumberCheck.checkIfPrime(13));
        System.out.println(primeNumberCheck.checkIfPrime(15));
        System.out.println(primeNumberCheck.checkIfPrime(63));
    }

    public boolean checkIfPrime(int num){
        if(num <= 1){
            return false;
        } else if (num <= 3) {
            return true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i < 10; i = i+2) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
