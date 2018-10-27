package zadania27102018;
/*
Zadanie 2. rekurencja - Dla podanego ciągu liczb całkowitych wypisz ten ciąg w odwrotnej kolejności.
Ciąg podajemy na sztywno w programie
List<Integer> chain = Arrays.asList(1,2,3,8,5,3,8);
 */

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> chain = Arrays.asList(1, 2, 3, 8, 5, 3, 8);
        System.out.println("rozmiar: " + chain.size());
        System.out.println("ostatni element: " + chain.get(chain.size() - 1));
        System.out.println("print");
        print(chain);
    }

    private static void print(List<Integer> chain) {
        while (chain.isEmpty() == false) {
            System.out.println(chain.get(chain.size()-1));
            chain.remove(chain.size()-1);
            print(chain);
        }

    }
}
