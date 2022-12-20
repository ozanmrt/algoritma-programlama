// n. dereceden y(x) polinomununun x=b için değerini y(b) hesaplayan program
package w10;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n Değerini Giriniz: ");
        int n = input.nextInt();
        System.out.print("b Değerini Giriniz: ");
        int b = input.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("A[" + i + "]: ");
            a[i] = input.nextInt();

        }
        double t = a[0];

        for (int i = 1; i < n; i++) {
            t = t + a[i] * Math.pow(b, i - 1);
        }

        System.out.println(t);

    }

}
