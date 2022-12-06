// AB için (CB/AC)=(AB/CB) - Altın Oran
package w8;

import java.util.Scanner;

public class Odev13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double AB;
        do {
            System.out.print("AB Uzunluğunu Giriniz: ");
            AB = input.nextInt();
        } while (AB <= 0);
        double x = Math.sqrt(5);
        double CB = (2 * AB) / (1 + x);
        double AC = AB - CB;
        System.out.println("AC = " + AC + " , CB = " + CB);
    }

}
