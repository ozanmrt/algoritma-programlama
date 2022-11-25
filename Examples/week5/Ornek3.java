/*
Adım 1: Başla
Adım 2: Kullanıcıdan B Değerini Al
Adım 3: a = 0
Adım 4: a < 100 değilse git adım 8
Adım 5:  Eğer b == (a * a * a) - (a * a) ise Ekrana a yı yazdır
Adım 6: a = a + 1
Adım 7: Git Adım 4
Adım 8: Bitir
 */
package week5;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.err.print("B Değerini Giriniz: ");
        int b = input.nextInt();

        for (int a = 0; a < 100; a++) {

            if (b == (a * a * a) - (a * a)) {
                System.out.println(a);
            }

        }

    }

}
