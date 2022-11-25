/*
Adım 1: Başla
Adım 9: Bitir

 */
package week4;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int s1, s2;

        System.out.print("1. Sayıyı Giriniz: ");
        s1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        s2 = input.nextInt();

        for (int i = s1; i <= s2; i++) {

            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
            }

        }

    }

}
