/* Sayıya Göre Haftanın Gününü Yazdır [1,7]
Adım 1: Başla
Adım 2: Kullanıcıdan Bir Sayı Al [1,7]
Adım 3: Sayı 1/7'e Eşitse ".." Yazdır.
Adım 4: Aksi Takdirde "Geçersiz İşlem" Yazdır.
Adım 5: Bitir
 */
package w2;
import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Tam Sayı Giriniz [1,7]: ");
        int sayi = input.nextInt();
        
        switch(sayi){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı"); break;
            case 3: System.out.println("Çarşamba"); break;
            case 4: System.out.println("Perşembe"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar"); break;
            default: System.out.println("Geçersiz İşlem!"); break;
        }
        
    }
}