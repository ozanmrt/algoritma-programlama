// Mükemmel Sayı Olup Olmadığını Bulan Program
package w8;

import java.util.Scanner;

public class Odev17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.print("Pozitif Bir Tam Sayı Giriniz: ");
            N = input.nextInt();
        } while (N <= 0);
        int T = 0;
        for (int k = 1; k <= N; k++) {
            if (N % k == 0) {
                T = T + k;
            }
        }
        if (T == N * 2) {
            System.out.println(+N + " Mükemmel Sayıdır.");
        } else {
            System.out.println(+N + " Mükemmel Sayı Değildir.");
        }
    }

}
