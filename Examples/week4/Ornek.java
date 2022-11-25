package week4;

import java.util.Scanner;

public class Ornek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, toplamTek = 0, toplamCift = 0;

        System.out.print("N Sayısını Giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                //System.out.println(i);
                toplamTek += i;
            } else {
                toplamCift += i;
            }

        }

        System.out.println("Tek Sayılar Toplamı: " + toplamTek+" \nÇift Sayılar Toplamı: "+toplamCift);

    }

}
