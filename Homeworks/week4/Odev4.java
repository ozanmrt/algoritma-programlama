/* pay/payda, tam kısmını al ve belirtilen basamağı yazdır

 */
package w4;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pay, payda, n, basamak = 0;

        System.out.print("Pay: ");
        pay = input.nextInt();
        System.out.print("Payda: ");
        payda = input.nextInt();
        System.out.print("Basamak: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
         
            pay *= 10;
            basamak = pay / payda;
            pay = pay % payda;

        }

        System.out.println("Basamak: " + basamak);
    }

}
