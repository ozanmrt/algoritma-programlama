// Aritmetik, Geometrik, Harmonik, Kontraharmonik Ortalama Hesaplama
package w10;

import java.util.Scanner;
import java.lang.Math;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        int[] A = new int[n];
        double t = 0, c = 1, ht = 0, t2 = 0;

        for (int i = 0; i < n; ++i) {
            System.out.print("A[" + i + "]: ");
            A[i] = input.nextInt();

            t += A[i];
            c *= A[i];
            ht += 1 / A[i];
            t2 += A[i] * A[i];

        }

        double ao = t / n, go = Math.pow(c, 1 / n), ho = n / ht, kho = t2 / t;

        System.out.println("Aritmetik Ortalama: " + ao);
        System.out.println("Geometrik Ortalama: " + go);
        System.out.println("Harmonik Ortalama: " + ho);
        System.out.println("Kontraharmonik Ortalama: " + kho);

    }

}
