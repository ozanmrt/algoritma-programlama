//Bölüm Sayısına Göre Kök 2 Değerini Hesaplama
package w8;

import java.util.Scanner;

public class Odev10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bölüm Sayısını Giriniz: ");
        int n = input.nextInt();
        double t = 1;

        for (int i = 1; i < n; i++) {
            t = 2 + (1 / t);

        }
        t = 1 + (1 / t);
        System.out.println("Kök 2 Değerininin Bölüm Sayısına Göre Değeri: " + t);
    }
}
