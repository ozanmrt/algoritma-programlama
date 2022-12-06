// Pisagor Üçlemesini Bulan Program
package w8;

import java.util.Scanner;

public class Odev22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Pozitif Tam Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);
        for (int a = 1; a <= n - 1; a++) {
            for (int b = a + 1; b <= n - a; b++) {
                int c = n - a - b;
                if (a * a + b * b == c * c) {
                    System.out.print("(" + a + "," + b + "," + c + ")");
                }
            }
        }
    }

}
