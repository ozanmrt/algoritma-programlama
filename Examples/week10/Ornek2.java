// Dizideki Elemanları Yer Değiştir
package week10;

import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length / 2; i++) {
            int g = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = g;
        }
        System.out.println("TERSİ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
