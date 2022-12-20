// Dizilerde Skaler Çarpım
package w10;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int skalerCarpim = 0;

        for (int i = 0; i < n; ++i) {
            System.out.print("A[" + i + "]: ");
            A[i] = input.nextInt();
            System.out.print("B[" + i + "]: ");
            B[i] = input.nextInt();

            skalerCarpim = skalerCarpim + A[i] * B[i];
        }

        System.out.println("Skaler Çarpım: " + skalerCarpim);

    }

}
