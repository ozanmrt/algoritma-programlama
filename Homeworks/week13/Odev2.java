// Girilen Sayı Asal Mı?
package w13;

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        boolean sonuc = AsalMi(input.nextInt());
        
        System.out.println(sonuc);
        

    }
    
    public static boolean AsalMi(int sayi){
    
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                return false;
            }
        }
        return true;
    
    }

    
}
