//Harfin Alfabedeki Sırası Kadar * Ekleme
package w11;

import java.util.Scanner;

public class Odev6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine().toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " -> ");
            for (int j = 0; j < text.charAt(i) - 64; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
