/* Asal Çarpanlarını Bulan Program
 */
package w6;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen Pozitif Tam Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        boolean asalmi;
        for (int i = 2; i <= n; i++) {
            asalmi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalmi = false;

                }
            }
            if (asalmi == true && n % i == 0) {
                System.out.println(i);
            }
        }

    }

}
