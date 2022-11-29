// e^x değerini Binom Açılımı ile Hesaplama
package w8;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("n: ");
        double n = input.nextDouble();

        double sonuc = Math.pow((1 + x / n), n);

        System.out.println("Sonuç: " + sonuc);
    }

}
