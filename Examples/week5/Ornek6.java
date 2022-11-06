/* Üçgen
Adım 1: Başla
Adım 8: Bitir
 */
package week5;
import java.util.Scanner;
public class Ornek6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır Sayısını Giriniz: ");
        int x = input.nextInt();
        
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
