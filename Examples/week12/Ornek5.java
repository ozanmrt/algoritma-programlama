package week12;

import java.util.Scanner;

public class Ornek5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();

        char[] sesliHarfler = {'a', 'e', 'ı', 'i', 'u', 'ü', 'o', 'ö'};
        int sayac = 0;
        
        for (int i = 0; i < txt.length(); i++) {

            for (int j = 0; j < sesliHarfler.length; j++) {
                if (txt.toLowerCase().charAt(i) == sesliHarfler[j]) {
                    sayac++;
                    System.out.println(i+1+". Harf");
                }
            }

        }
     
        System.out.println(sayac + " Tane Sesli Harf Var");
    }

}
