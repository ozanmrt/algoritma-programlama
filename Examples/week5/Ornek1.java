/*

 */
package week5;

import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Pozitif Bir Tam Sayı Giriniz: ");
            sayi = input.nextInt();
            
        } while (sayi<=0);

    }

}
