// cos(x) Maclaurin Serisi
package w8;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x Açısı: ");
        int x = input.nextInt();
        System.out.print("Terim Sayısı: ");
        int n = input.nextInt();
        int a = 1;
        double toplam = 1;
        double fak = 1;
        int genelx = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    fak *= j;
                    genelx *= genelx;
                }
                if (a == 1) {
                    toplam = toplam - (genelx / fak);
                    a = 2;
                } else {
                    toplam = toplam + (genelx / fak);
                    a = 1;
                }
            }
        }
        System.out.println("cos(x) Maclaurin Sonucu: " + toplam);
    }

}
