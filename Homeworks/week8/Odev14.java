// Üçgenin Kenarları = a , a , a*(1+5^(1/2))/2
package w8;

import java.util.Scanner;

public class Odev14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a;
        do {
            System.out.print("İkizkenar Üçgenin Kısa Kenarını Giriniz: ");
            a = input.nextDouble();
        } while (a <= 0);
        double x = Math.sqrt(5);
        double b = a * (1 + x) / 2;
        System.out.print("Kısa kenarını girdiğiniz altın üçgen:" + a + " , " + b + " , " + b + " üçgenidir");
    }

}
