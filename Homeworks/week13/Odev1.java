// n'e Kadar Olan Sayıların Kareleri Toplamını Veren Method
package w13;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N Değerini Giriniz: ");
        KareleriToplami(input.nextInt());

    }

    public static void KareleriToplami(int n) {

        int toplam = 0;

        System.out.print("Toplam: ");

        for (int i = 0; i <= n; i++) {

            if (i == n) {
                System.out.print(i + "² = ");
            } else {
                System.out.print(i + "² + ");
            }

            toplam += i * i;

        }
        
        System.out.println(toplam);
        

    }

}
