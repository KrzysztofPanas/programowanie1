import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę do obliczenia silni:");
        int input = new Scanner(System.in).nextInt();
        int output = calculate(input);
        System.out.println(input + " silnia to: " + output);
    }

    private static int calculate(int n) {
        if(n < 2)return 1;

        return n * calculate(n-1);
    }
}
