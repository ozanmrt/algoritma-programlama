//Bir önceki ve bir sonraki Fibonacci sayısını bulma
package w8;

import java.util.Scanner;

public class Odev7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Sayısı: ");
        int f2 = input.nextInt();
        double ao = (1 + Math.sqrt(5)) / 2;
        int f1 = (int) (f2 / ao);
        int f3 = (int) (f2 * ao);

        System.out.println(f1 + "-" + f2 + "-" + f3);
    }
}
