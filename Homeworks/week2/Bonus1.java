/* Girilen İki Sayıyı Büyük-Küçük Olarak Ayırma

Başla
Kullanıcıdan Birinci Sayıyı Al
Kullanıcıdan İkinci Sayıyı Al
Büyük Küçük Ayrımını Yap
Ekrana Yazdır
Bitir


*/

import java.util.Scanner;

public class Bonus1 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Birinci Sayıyı Giriniz: ");
        int bs = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int is = input.nextInt();
        
        if (bs>is) {
            System.out.println("Büyük Olan: "+bs+"\nKüçük Olan: "+is);
        }
        else if (bs==is) {
            System.out.println(bs+" Sayısı "+is+" Sayısına Eşittir.");
        }
        else{
            System.out.println("Büyük Olan: "+is+"\nKüçük Olan: "+bs);
        }
        
        
        
    } 
}
