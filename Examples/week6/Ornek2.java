/* Üçgen
Adım 1: Başla
Adım 8: Bitir
 */
package week6;

import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int satir = input.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int m = i; m <= satir-1; m++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

}
