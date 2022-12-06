// X ve Y Sayısına Göre Leyand Sayılarını Yazan Program
package w8;

import java.util.Scanner;

public class Odev18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        do {
            System.out.print("x(x>1) Değerini Giriniz: ");
            x = input.nextInt();
        } while (x <= 1);
        int y;
        do {
            System.out.print("y(y>1) Değerini Giriniz: ");
            y = input.nextInt();
        } while (y <= 1);
        double a = Math.pow(x, y);
        double b = Math.pow(y, x);
        double S = a + b;
        System.out.println(S);
    }

}
