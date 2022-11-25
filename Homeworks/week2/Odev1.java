/* Üçgen Alanı Ödev 1

Başla
Kullanıcıdan Kenar Uzunluğunu Al (a)
Kullanıcıdan Yüksekliği Al (h)
Alan = a*h/2
Ekrana Alanı Yazdır
Bitir

*/

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        float a,h,alan;
        
        System.out.print("Kenar Uzunluğunu Giriniz: ");
        a = input.nextFloat();
        System.out.print("Yüksekliği Giriniz: ");
        h = input.nextFloat();
        alan = a*h/2;
        
        System.out.println("Alanı: " + alan);
        
    }
    
}
