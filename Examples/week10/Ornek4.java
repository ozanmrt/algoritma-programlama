// Fibonacci Diziler
package week10;

import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        int[] fiboc = new int[n];
        fiboc[0] = 1;
        fiboc[1] = 1;

        for (int i = 2; i < fiboc.length; ++i) {
            fiboc[i] = fiboc[i - 2] + fiboc[i - 1];
        }
        for (int i = 0; i < fiboc.length; i++) {
            System.out.print(fiboc[i] + " ");
        }

    }

}
