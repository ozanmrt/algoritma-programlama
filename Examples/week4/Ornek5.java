/*
Adım 1: Başla
Adım 9: Bitir

 */
package week4;

import java.util.Scanner;

public class Ornek5 {

    public static void main(String[] args) {

        int sayi;
        boolean asalMi=true;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        sayi = input.nextInt();

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                System.out.println(i + " Sayısına Bölündüğü İçin Asal Değil");
                asalMi=false;
            }

        }
        if (asalMi==true) {
            System.out.println(sayi + " Sayısı Asal Sayıdır");
        }
        
        

    }

}
