package week12;

import java.util.Scanner;

public class Ornek8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();

        char[] ayrac = {' ', ',', ';', ':'};
        int sayac = 1;
        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < ayrac.length; j++) {
                if (txt.charAt(i) == ayrac[j]) {
                    sayac++;
                }
            }
        }
        System.out.println(sayac + " Tane Kelime Vardır");
        System.out.println();
    }

}
