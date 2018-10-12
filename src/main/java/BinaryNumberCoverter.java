import java.util.Scanner;

public class BinaryNumberCoverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(convert(n.toString()));
    }

    private static String convert(String toString) {
        Integer digit = Integer.parseInt(toString);
        Integer digitDiv2 = digit / 2;
        if ( digit <= 1 ){
            return digit.toString();
        }
        return convert(digitDiv2.toString()) + digit % 2;
    }
}
