//Chen Asalı
package w8;

import java.util.Scanner;

public class Odev11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Pozitif Bir Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        boolean asalmi = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                asalmi = false;

            }

        }
        int a = n + 2;
        boolean chenasalimi = true;
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                asalmi = false;

            }
        }
        if (asalmi == true && n != 1 && chenasalimi == true) {
            System.out.println(+n + " Chen Asalıdır");
        } else {
            System.out.println(+n + " Chen Asalı Değildir");
        }
    }

}
