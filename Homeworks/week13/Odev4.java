// İki Boyutlu Diziyi Random Sayılarla Doldur
package w13;

import java.util.Random;
import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        System.out.print("Üst Sınır: ");
        int us = input.nextInt();

        DiziyiDoldur(us, n, m);

    }

    public static void DiziyiDoldur(int us, int n, int m) {

        int[][] a = new int[n][m];
        Random rs = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = rs.nextInt(us);
                System.out.println("a[" + i + "][" + j + "]" + " = " + a[i][j]);
            }
        }

    }

}
