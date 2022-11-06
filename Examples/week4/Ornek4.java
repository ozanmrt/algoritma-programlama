/*
Adım 1: Başla
Adım 9: Bitir

 */
package week4;

import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {

        int toplam = 0, n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        n = input.nextInt();

        while (n > 0) {
            toplam = toplam + (n % 10);
            n = n / 10;
        }

        System.out.println("Toplam: " + toplam);

    }

}
