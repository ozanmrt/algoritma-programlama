//Harf Büyükse Küçülten Küçükse Büyülten Program
package w11;

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 65) && (text.charAt(i) <= 90)) {

                System.out.print((char)(text.charAt(i) + 32));

            } else {
                System.out.print((char)(text.charAt(i) - 32));
            }
        }

    }

}
