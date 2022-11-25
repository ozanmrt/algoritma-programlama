/*  Girilen Sayının Tek mi Çift mi Olduğunu Söyleyen Program

Başla
Kullanıcıdan Bir Sayı Al
Sayı%2==0 ise "Çift" Yazdır
Aksi Takdirde "Tek" (YazdırSayı%2==1)
Ekrana Sonucu Yazdır
Bitir

 */

import java.util.Scanner;

public class Bonus3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");

        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " Sayısı Çifttir");
        } else {
            System.out.println(sayi + " Sayısı Tektir");
        }

    }

}
