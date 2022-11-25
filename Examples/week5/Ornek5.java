/* SINAV SORUSU
Adım 1: Başla
Adım 8: Bitir
 */
package week5;
import java.util.Scanner;
public class Ornek5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır Sayısını Giriniz: ");
        int satir = input.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        int sutun = input.nextInt();
        
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("X");
            }
            System.out.println();

        }

    }

}
