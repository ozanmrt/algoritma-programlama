// Lim,n→∞(1+(x/n)^n) için eˣ değerini bul
package w8;

import java.util.Scanner;

public class Odev12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("X Değerini Giriniz: ");
        int x = input.nextInt();
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();
        double sonuc = (double) Math.pow(1 + (x / n), n);
        if (n == 0) {
            System.out.println("e üssü " + x + " = 1");
        } else {
            System.out.println("e üssü " + x + " = " + sonuc);
        }
    }

}
