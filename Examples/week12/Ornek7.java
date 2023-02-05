package week12;

import java.util.Scanner;

public class Ornek7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();

        for (int i = 0 ; i <txt.length()/2; i++) {
            System.out.print(txt.toLowerCase().charAt(i));
            System.out.print(txt.toLowerCase().charAt(txt.length()-1-i));
  
        }
        if (txt.length()%2==1) {
            System.out.println(txt.toLowerCase().charAt(txt.length()/2));
        }
        System.out.println();
    }

}
