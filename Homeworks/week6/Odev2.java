/* Chen Asal Sayısı
 */
package w6;

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen Pozitif Bir Tam Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        boolean asalMi = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                asalMi = false;

            }

        }
        int a = n + 2;
        boolean chenAsaliMi = true; //varsayım/asal olursa
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                chenAsaliMi = false;

            }
        }
        if (asalMi == true && n != 1 && chenAsaliMi == true) {
            System.out.println(+n + " Chen Asalıdır");
        } else {
            System.out.println(+n + " Chen Asalı Değildir");
        }

    }

}
