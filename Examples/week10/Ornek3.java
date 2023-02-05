// Sınıf Ort
package week10;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int t = 0;
        for (int i = 0; i < n; i++) {
            t = t + a[i];
        }
        int ort = t / n;
        int sayacGecti = 0, sayacKaldi = 0; // Ya da n-sayac kullan
        for (int i = 0; i < n; i++) {
            if (a[i] < ort) {
                System.out.println(a[i] + " Kaldı");
                sayacKaldi++;
            } else {
                System.out.println(a[i] + " Geçti");
                sayacGecti++;
            }
        }
        System.out.println("Geçen Kişi Sayısı: " + sayacGecti + "\nKalan Kişi Sayısı: " + sayacKaldi);

    }

}
