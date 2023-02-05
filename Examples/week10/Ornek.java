/* Dizideki Max-Min Sayıları Bul
Adım 1: Başla
Adım 9: Bitir
 */
package week10;

import java.util.Random;
import java.util.Scanner;

public class Ornek {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("N Değeri: ");
        int n = input.nextInt();

        int[] sayi = new int[n];
        for (int i = 0; i < n; i++) { // Diziye Random Sayıları Ekle
            sayi[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < n; i++) { // Dizi Elemanlarını Göster
            System.out.print(sayi[i] + " ");
        }

        System.out.println();

        int max = sayi[0], min = sayi[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < sayi.length; i++) { // Min - Max 

            if (sayi[i] < min) {
                min = sayi[i];
                minIndex = i;
            }
            if (sayi[i] > max) {
                max = sayi[i];
                maxIndex = i;
            }
        }
        System.out.println("Min[" + minIndex + "]: " + min + " Max[" + maxIndex + "]: " + max);

    }

}
