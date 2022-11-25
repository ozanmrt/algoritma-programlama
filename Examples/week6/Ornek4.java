package week6;

/* Random Verilen Sayıyı Bulma Oyunu

Başla
Rastgele Bir Sayı Oluştur
Kullanıcıdan Tahminini Al
Eğer Tahmin Doğruysa Bir Sonraki Adıma Geç. Doğru Değilse Daha Büyük/Küçük Değer Girmesini Söyle ve Bir Önceki Adıma Geri Dön.
Ekrana Yazdır
Bitir


*/

import java.util.Scanner;
import java.util.Random;

public class Ornek4 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        
        int randSayi = rand.nextInt(99)+1;
        int tahmin;
        do {            
            System.out.print("Sayıyı Tahmin Et [1-99]: ");
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
