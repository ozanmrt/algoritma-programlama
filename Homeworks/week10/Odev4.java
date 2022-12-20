// A Dizisinden Pozitif Elemanları B dizisine Negatifleri C dizisine Aktarma
package w10;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("A[" + i + "]: ");
            A[i] = input.nextInt();

        }
        System.out.println("***");
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[i] = A[i];
                System.out.println("B[" + i + "]: " + A[i]);
            } else if (A[i] < 0) {
                C[i] = A[i];
                System.out.println("C[" + i + "]: " + A[i]);
            }
        }

    }

}
