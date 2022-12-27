//İki Büyük İki Küçük Harf
package w11;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();
        int r, s = 0;
        for (int i = 0; i < text.length(); i++) {
            r = s % 4;
            s = s + 1;
            if (r < 2) {
                System.out.print(text.toUpperCase().charAt(i));
            } else {
                System.out.print(text.toLowerCase().charAt(i));
            }

        }

    }
}
