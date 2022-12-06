// İkiz Asallar Yazdıran Program
package w8;

import java.util.Scanner;

public class Odev16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.print("2'den Büyük Alt Sınır Giriniz: ");
            N = input.nextInt();
        } while (N <= 2);
        for (int k = 2; k <= N - 2; k++) {
            boolean asalmi1 = true;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    asalmi1 = false;
                }
            }
            int u = k + 2;
            boolean asalmi2 = true;
            for (int j = 2; j < u; j++) {
                if (u % j == 0) {
                    asalmi2 = false;
                }
            }
            if (asalmi2 == true && asalmi1 == true) {
                System.out.print("(" + k + "," + u + ") ");
            }
        }
    }

}
