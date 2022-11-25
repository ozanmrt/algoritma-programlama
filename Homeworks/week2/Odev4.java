/* Potansiyel ve Kinetik Enerjisini Hesaplama - Ödev 4

Başla
Kullanıcıdan Kütleyi Al(m)
Kullanıcıdan Hızı Al(v)
Kullanıcıdan Yüksekliği Al(h)
pe=m*9.8*h
ke = m*v*v/2
Ekrana Potansiyel ve Kinetik Enerjiyi Yazdır
Bitir

*/

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double m,v,h,pe,ke;
        
        System.out.print("Kütleyi Giriniz: ");
        m = input.nextDouble();
        System.out.print("Hızı Giriniz: ");
        v = input.nextDouble();
        System.out.print("Yüksekliği Giriniz: ");
        h = input.nextDouble();
        
        pe = m*9.8*h;
        ke = m*v*v/2;
        
        System.out.println("Potansiyel Enerji: "+pe+"\nKinetik Enerji: "+ke);
    }
    
}
