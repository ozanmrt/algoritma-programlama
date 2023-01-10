// İki Boyutlu Dizilerin Toplamı
package w13;

import java.util.Random;
import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rs = new Random();
        System.out.print("Dizilerin Eleman Sayıları: ");
        int es = input.nextInt();

        int[][] a = new int[es][es];
        int[][] b = new int[es][es];

        System.out.print("Üst Sınır: ");
        int us = input.nextInt();

        for (int i = 0; i < es; i++) {
            for (int j = 0; j < es; j++) {
                a[i][j] = rs.nextInt(us);
                System.out.println("a[" + i + "][" + j + "]" + " = " + a[i][j]);
                b[i][j] = rs.nextInt(us);
                System.out.println("b[" + i + "][" + j + "]" + " = " + b[i][j]);
            }
        }

        diziToplama(a, b, es);
    }

    public static void diziToplama(int[][] dizi1, int[][] dizi2, int es) {
        int[][] c = new int[es][es];

        System.out.println("Dizi Toplam: ");
        for (int i = 0; i < es; i++) {
            for (int j = 0; j < es; j++) {
                c[i][j] = dizi1[i][j] + dizi2[i][j];
                System.out.println("c[" + i + "][" + j + "]" + " = " + c[i][j]);
            }
        }
    }

}
