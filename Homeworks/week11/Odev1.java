//Texti Rastgele Büyüklükte Yaz
package w11;

import java.util.Random;
import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();
        
        Random r = new Random();
        
        for (int i = 0; i < text.length(); i++) {
            int rs = r.nextInt(10);       
            
            if (rs%2==0) {
                System.out.print(text.toUpperCase().charAt(i));
            } else {
                System.out.print(text.toLowerCase().charAt(i));
            }
        }
    }
}
