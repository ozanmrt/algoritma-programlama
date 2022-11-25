/* 2 tam sayıyı çarpma operatörü kullanmadan çarpma
Adım 1: Başla
Adım 2: Kullanıcıdan 1. ve 2. Sayıyı Al (s1,s2)
Adım 3: toplam = 0
Adım 4: i = 0
Adım 5: i >= s1 git Adım 9
Adım 6: toplam = toplam + s2
Adım 7: i = i+1
Adım 8: git Adım 5
Adım 9: Ekrana Toplamı Yazdır
Adım 10: Bitir


 */
package w2;

import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        int s1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        int s2 = input.nextInt();
        int toplam = 0;
        for (int i = 0; i < s1; i++) {
            toplam +=s2;
        }
        System.out.println(toplam);

    }

}
