//i/i! ..... n/n!
package week9;

import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Değeri: ");
        int n = input.nextInt();
        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            int fakt = 1;
            for (int j = i; j > 0; j--) {
                fakt = j * fakt;
            }
            /*for (int j = 1; j <= i; j++) {
                fakt *= j;
            }*/
            toplam += (double) i / fakt;
        }
        System.out.println(toplam);
    }

}
