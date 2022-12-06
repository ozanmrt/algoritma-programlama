// Gümüş Oranda Bölme
package w8;

import java.util.Scanner;

public class Odev15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double u;
        do {
            System.out.print("Doğru Parçasının Uzunluğunu Giriniz: ");
            u = input.nextDouble();
        } while (u <= 0);
        double x = Math.sqrt(2);
        double a = u / x;
        double b = u - a;
        System.out.println("Doğru Parçası " + a + " , " + b + " Oranında Kesilir");
    }

}
