package week12;

import java.util.Scanner;

public class Ornek6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();
        
        for (int i = 0; i < txt.length(); i++) {
            char harf = txt.charAt(i);
            System.out.print(harf+""+(i+1));
        }
        System.out.println();
    }

}
