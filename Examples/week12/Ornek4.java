package week12;

import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();
        for (int i = txt.length() - 1; i >= 0; i -= 2) {
            System.out.print(txt.toUpperCase().charAt(i));
            if (i != 0) {
                System.out.print(txt.toLowerCase().charAt(i - 1));
            }
        }
        System.out.println();
    }

}
