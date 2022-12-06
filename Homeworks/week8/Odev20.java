// Tau Sayısı
package w8;

import java.util.Scanner;

public class Odev20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Pozitif Bir Tam Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = s + 1;
            }
        }
        if (n % s == 0) {
            System.out.println(+n + " Tau Sayısıdır");
        } else {
            System.out.println(+n + " Tau Sayısı Değildir");
        }
    }

}
