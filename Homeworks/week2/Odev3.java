/* Kürenin Alanını ve Hacmini Hesaplama - Ödev 3

Başla
Kullanıcıdan Yarıçapı Al(r)
Alan = 4*pi*r^2
Hacim = (4*pi*r^3)/3
Ekrana Alanı ve Hacmi Yazdır
Bitir

*/

import java.util.Scanner;
import java.lang.Math;

public class Odev3 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double r,alan,hacim;
        
        System.out.print("Kürenin Yarıçapını Giriniz: ");
        r = input.nextFloat();
        alan=4*Math.PI*Math.pow(r,2);
        hacim = (4*Math.PI*Math.pow(r,3))/3;
        System.out.println("Kürenin Alanı: "+alan+"\nKürenin Hacmi: "+hacim);
        
    }
    
}
