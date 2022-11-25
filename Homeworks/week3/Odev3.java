/* 3 Kenarı Girilen Üçgenin Eşkenar, İkizkenar veya Çeşitkenar Olduğunu Bul
Adım 1: Başla
Adım 2: Kullanıcıdan 1. 2. ve 3. Kenarı Al (k1,k2,k3)
Adım 3: k1, k2, k3 Birbirine Eşitse Ekrana "Eşkenar Üçgen" Yazdır.
Adım 4: Herhangi İki Kenarı Eşit 3. Kenar Farklıysa "İkizkenar Üçgen" Yazdır.
Adım 5: Aksi Takdirde "Çeşitkenar Üçgen" Yazdır.
Adım 6: Bitir
 */
package w2;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        int k1 = input.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        int k2 = input.nextInt();
        System.out.print("3. Kenarı Giriniz: ");
        int k3 = input.nextInt();
        
        if (k1==k2 && k2==k3) {
            System.out.println("Eşkenar Üçgen");
        } 
        else if(k1==k2 || k1==k3 || k2==k3)
        {
            System.out.println("İkizkenar Üçgen");
        }
        else
        {
            System.out.println("Çeşitkenar Üçgen");
        }
        
    }
}
