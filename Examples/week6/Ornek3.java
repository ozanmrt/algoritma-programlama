/* Üçgen
Adım 1: Başla
Adım 8: Bitir
 */
package week6;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int satir = input.nextInt();

        for (int i = 1; i <= satir; i++) {

            if (i == 1 || i == satir) {

                for (int n = 1; n <= satir; n++) {
                    System.out.print("*");
                }
            } else {
                for (int m = 1; m <= satir; m++) {
                    if (m == 1 || m == satir) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                }
            }
            System.out.println("");
        }

    }

}
