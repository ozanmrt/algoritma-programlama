/* Aritmetik Sayı
 */
package w6;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen Pozitif Tam Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        int toplam = 0, sayac = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                toplam = toplam + i;
                sayac++;
            }
        }
        float ondalikli = (float) toplam / sayac;
        int tamSayi = toplam / sayac;

        if (ondalikli == tamSayi) {
            System.out.println(+n + " Aritmetik Sayıdır");
        } else {
            System.out.println(+n + " Aritmetik Sayı Değildir");
        }

    }

}
