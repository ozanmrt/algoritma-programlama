/* Alınan n sayısına kadar olan sayıların karelerinin toplamı
Adım 1: Başla
Adım 2: Kullanıcıdan Sayıyı Al (n)
Adım 3: Toplam=0
Adım 4: i=1
Adım 5: i>n ise git Adım 9
Adım 6: toplam = toplam + (i^2)
Adım 7: i = i + 1
Adım 8: git Adım 5
Adım 9: Ekrana Toplamı Yazdır
Adım 10: Bitir
 */
package w2;

import java.util.Scanner;

public class Odev6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, toplam = 0;

        System.out.print("N Sayısını Giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
                System.out.println(Math.pow(i, 2));
                toplam += Math.pow(i, 2);          
        }

        System.out.println("Kareleri Toplamı: " + toplam);

    }
}
