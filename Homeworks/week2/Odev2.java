/* Derecenin Radyan ve Grad Cinsne Dönüşümü - Ödev 2

Adım 1: Başla
Adım 2: Kullanıcıdan Dereceyi Al(D)
Adım 3: R=D*pi/180
Adım 4: G = D*200/180
Adım 5: Ekrana Radyanı ve Gradı Yazdır
Adım 6: Bitir

*/

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double D,R,G;
        
        
        System.out.print("Dereceyi Giriniz: ");
        D = input.nextDouble();
        R=D*Math.PI/180;
        G = D*200/180;
        
        System.out.println("Radyan: "+R+"\nGrad: "+G);
        
    }
    
}
