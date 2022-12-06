// Eulerian Sayısı
package w8;

import java.util.Scanner;

public class Odev21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m;
        int n;
        do {
            System.out.print("m Değerini Giriniz: ");
            m = input.nextInt();
        } while (m <= 0);
        do {
            System.out.print("n Değerini Giriniz(m>n): ");
            n = input.nextInt();
        } while (n <= 0 || m <= n);
        double T = 0;
        for (int i = 0; i <= n; i++) {
            int C1 = 1;
            for (int j = 1; j <= m + 1; j++) {
                C1 = C1 * j;
            }
            int C2 = 1;
            if (m + 1 <= i) {
            } else {
                for (int k = 1; k <= m + 1 - i; k++) {
                    C2 = C2 * k;
                }
            }
            int C3 = 1;
            if (i <= 0) {
            } else {
                for (int l = 1; l <= i; l++) {
                    C3 = C3 * l;
                }
            }
            double kom = C1 / (C2 * C3);
            double x = Math.pow(-1, i);
            double y = Math.pow(n + 1 - i, m);
            T += (double) x * kom * y;
        }
        System.out.println("E(" + m + "," + n + ")=" + T);
    }

}
