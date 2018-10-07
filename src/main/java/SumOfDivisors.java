import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, której dzielniki zostaną zsumowane:");
        int number = new Scanner(System.in).nextInt();
        int sumOfDivisors =  calculateSumOfDivisors(number);
        System.out.println("Suma dzielników liczby " + number + " to " + sumOfDivisors);
    }

    private static int calculateSumOfDivisors(int n) {
        int sum = 0;
        for ( int i = 1 ; i <= n ; i ++) {
            if (n%i == 0) sum = i + sum;
        }
        return sum;
    }

}
