/* Üçgen
Adım 1: Başla
Adım 8: Bitir
 */
package week6;

import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int satir = input.nextInt();

        for (int i = satir; i >= 1; i--) {

            for (int m = i; m < satir; m++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

}