/*mm, cm, dm, km Dönüşümü


 */
package w4;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int metre, birim, yeniDeger;
        System.out.print("Metre Değerini Giriniz: ");
        metre = input.nextInt();
        System.out.print("Dönüştürmek İstediğiniz Birimi Seçin\n (1-mm , 2-cm, 3-dm, 4-km): ");
        birim = input.nextInt();

        switch (birim) {
            case 1:
                yeniDeger = metre * 1000;
                System.out.println(metre+"m = "+yeniDeger+"mm");
                break;
            case 2:
                yeniDeger = metre * 100;
                System.out.println(metre+"m = "+yeniDeger+"cm");
                break;
            case 3:
                yeniDeger = metre * 10;
                System.out.println(metre+"m = "+yeniDeger+"dm");
                break;
            case 4:
                yeniDeger = metre / 1000;
                System.out.println(metre+"m = "+yeniDeger+"km");
                break;
            default:
                System.out.println("Geçersiz İşlem!");
                break;
        }

    }

}
