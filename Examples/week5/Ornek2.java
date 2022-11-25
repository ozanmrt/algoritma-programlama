/*
Adım 1: Başla
Adım 2: Kullanıcıdan Vize Notunu Al
Adım 3: Kullanıcıdan Final Notunu Al
Adım 4: vize < 0, vize > 100, finalNot < 0 ya da finalNot > 100 ise git Adım 2
Adım 5: Ortalamayı Hesapla
Adım 6: Ortalama 80 ile 100 Arasında ise AA Yazdır
Adım 7: Ortalama 60 ile 79 arasında ise BB Yazdır
Adım 8: Ortalama 50 ile 59 Arasında ise CC Yazdır
Adım 9: Hiçbiri değilse DD Yazdır
Adım 10: Bitir

 */
package week5;

import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vize, finalNot;
        double ort;

        do {
            System.out.print("1. Notu Giriniz: ");
            vize = input.nextInt();
            System.out.print("2. Notu Giriniz: ");
            finalNot = input.nextInt();
        } while (vize < 0 || vize > 100 || finalNot < 0 || finalNot > 100);

        ort = (vize * 40 / 100) + (finalNot * 60 / 100);

        if (ort >= 80 && ort <= 100) {
            System.out.println("AA");
        } else if (ort >= 60 && ort <= 79) {
            System.out.println("BB");
        } else if (ort >= 50 && ort <= 59) {
            System.out.println("CC");
        }
        else{
        System.out.println("DD");
        }
    }

}
