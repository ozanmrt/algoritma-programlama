/* Gerilim Hesaplama - Ödev 5

Başla
Kullanıcıdan Direnci Al(R)
Kullanıcıdan Akımı Al(I)
V=I*R
Ekrana Gerilimi Yazdır
Bitir

*/

import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int V,I,R;
           
        System.out.print("Direnci Giriniz: ");
        R = input.nextInt();
        System.out.print("Akımı Giriniz: ");
        I = input.nextInt();
        
        V=I*R;
        
        System.out.println("Gerilim: "+V);
        
    }
    
}
