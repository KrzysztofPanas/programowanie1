import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę do obliczenia silni:");
        int input = new Scanner(System.in).nextInt();
        int output = calculateFactorial(input);
        System.out.println(input + " silnia to: " + output);
    }

    private static int calculateFactorial(int input) {
        int wynik;
        if (input > 1) {
            wynik = input * calculateFactorial(input-1);
        } else wynik = 1;
        return wynik;
    }
}
