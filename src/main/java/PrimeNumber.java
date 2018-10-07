import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę do sprawdzenia: ");
        int input = new Scanner(System.in).nextInt();
        boolean ifPrime = primeNumberchecker(input);
        writeAnswer(ifPrime);
    }

    private static void writeAnswer(boolean ifPrime) {
        if (ifPrime == true) {
            System.out.println("Liczba jest pierwsza.");
        } else System.out.println("Liczba nie jest pierwsza.");
    }

    private static boolean primeNumberchecker(int input) {
        boolean isPrime = true;
        for (int i = 2 ; i < input ; i++){
            if (input%i == 0) isPrime = false;
        }
        return isPrime;
    }

}
