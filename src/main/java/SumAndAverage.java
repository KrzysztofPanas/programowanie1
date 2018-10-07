import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Wpisuj liczby do zsumowania i uśrednienia [0 - kończy]");
//        Double arrayOfResults[] = new Double[2];
        Double arrayOfResults[] = getSumAndAverage();
        System.out.println("Suma liczb: " + arrayOfResults[0]);
        System.out.println("Średnia z liczb: " + arrayOfResults[1]);

    }

    private static Double[] getSumAndAverage() {
        Double sumAndAverageArray[] = new Double[2];
        int couter = -1;
        int i;
        int sum = 0;
        do {
            i = new Scanner(System.in).nextInt();
            sum = sum + i;
            couter ++;
        } while (0 != i);
        sumAndAverageArray[0] = new Double(sum);
        sumAndAverageArray[1] = new Double(sum / couter);
        return sumAndAverageArray;
    }
}
