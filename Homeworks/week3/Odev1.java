/* Girilen Sayı Negatif mi Pozitif Mi Sıfır mı
Adım 1: Başla
Adım 2: Kullanıcıdan Bir Sayı Al
Adım 3: Eğer Sayı 0'dan Büyükse "Pozitif" Yazdır.
Adım 4: Eğer Sayı 0'dan Küçükse "Negatif" Yazdır.
Adım 5: Aksi Takdirde Sayı 0 Yazdır.
Adım 6: Bitir
 */
package w2;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Tam Sayı Giriniz: ");
        int sayi = input.nextInt();

        if (sayi > 0) {
            System.out.println(sayi + " Sayısı Pozitiftir.");
        } else if (sayi < 0) {
            System.out.println(sayi + " Sayısı Negatiftir.");
        } else {
            System.out.println("Sayı 0");
        }
    }

}
