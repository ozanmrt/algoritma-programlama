//Sayı Tahmin Oyunu

package w8;

import java.util.Random;
import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randSayi = rand.nextInt(100)+1;
        int tahmin;
        do {            
            System.out.print("Sayıyı Tahmin Et [1-100]: ");
            tahmin = input.nextInt();
            
            if (tahmin>randSayi) {
                System.out.println("Daha DÜŞÜK Bir Değer Giriniz!");
            } else if(tahmin<randSayi){
                System.out.println("Daha BÜYÜK Bir Değer Giriniz!");
            }
            
            
        } while (randSayi!=tahmin);
        
        
        System.out.println("Tebrikler Doğru Sayıyı Buldunuz! ("+randSayi+")");

    }
}
