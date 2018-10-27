package zadania27102018;

/*
Twoim zadaniem jest sprawdzenie, czy podana liczba 11-cyfrowa jest poprawnym PESELem.
Aby sprawdzić czy dany PESEL jest prawidłowy należy wykonać następujące działania:
Pierwszą cyfrę mnożymy przez 1,
drugą cyfrę mnożymy przez 3,
trzecią cyfrę mnożymy przez 7,
czwarta cyfrę mnożymy przez 9,
piątą cyfrę mnożymy przez 1,
szóstą cyfrę mnożymy przez 3,
siódmą cyfrę mnożymy przez 7,
ósmą cyfrę mnożymy przez 9,
dziewiątą cyfrę mnożymy przez 1,
dziesiątą cyfrę mnożymy przez 3,
jedenastą cyfrę mnożymy przez 1.
Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy. Przykład dla numeru PESEL 44051401458
4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110
Jeśli suma jest większa od zera, wtedy sprawdzamy jej poprawność. W przeciwnym przypadku nr PESEL jest błędny. Ponieważ ostatnia cyfra liczby 110 jest zerem więc podany PESEL jest prawidłowy.
Na wejściu podana jest w pojedyńczej linii ilość t<=100 numerów PESEL do sprawdzenia. W kolejnych t liniach są 11-cyfrowe liczby.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Pesel {

    public static void main(String[] args) {

        Integer[] numberPesel = new Integer[11];
        numberPesel = getPesel();
//        System.out.println(Arrays.asList(numberPesel));
        boolean isPeselOk;
        isPeselOk = checkPesel(numberPesel);
        if(isPeselOk) System.out.println("jest ok");
        else System.out.println("BŁĄD !!!");
    }

    private static boolean checkPesel(Integer[] numberPesel) {

        Integer temporatyValue
                = numberPesel[0]
                + numberPesel[1] * 3
                + numberPesel[2] * 7
                + numberPesel[3] * 9
                + numberPesel[4]
                + numberPesel[5] * 3
                + numberPesel[6] * 7
                + numberPesel[7] * 9
                + numberPesel[8]
                + numberPesel[9] * 3
                + numberPesel[10];
        if (temporatyValue%10 == 0) return true;
        else return false;
    }


    private static Integer[] getPesel() {
        Integer[] temporaryPeselNumber = new Integer[11];
        System.out.println("wpisuj numer PESEL odzielając Enterem kolejne cyfry");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 11; i++){
            temporaryPeselNumber[i] = scanner.nextInt();
        }
        return temporaryPeselNumber;
    }

}
