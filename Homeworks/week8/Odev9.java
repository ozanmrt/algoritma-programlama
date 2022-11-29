//Brothers Formülüne Göre Hesaplama
package w8;

import java.util.Scanner;

public class Odev9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Terim Sayısını Giriniz: ");
        int n = input.nextInt();
        int t = 2;
        int f = 1;
        for (int i = 1; i < n; i++) {

            f *= 2 * i + 1;

            t = t + (2 * i + 2) / f;
        }
        System.out.println("Sonuç: " + t);
    }
}
