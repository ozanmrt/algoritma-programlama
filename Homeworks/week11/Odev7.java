//Ortadan Bölüp Her Bir Parçasını Tersten Yazdırma
package w11;

import java.util.Scanner;

public class Odev7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle Gir: ");
        String cumle = input.nextLine();
        int n = cumle.length();

        for (int i = n / 2; i > 0; i--) {
            System.out.print(cumle.charAt(i - 1));
        }

        for (int i = 1; i < (n / 2 + 1); i++) {
            System.out.print(cumle.charAt(n - i));
        }

    }
}
