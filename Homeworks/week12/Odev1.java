//Üst Üçgen Matris Sorusu
package w12;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("NxN Matris İçin N Değerini Giriniz: ");
        int N = input.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];

        System.out.println("A Matrisinin Elemanlarını Giriniz: ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = input.nextInt();
                if (i > j) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = A[i][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }

    }

}
