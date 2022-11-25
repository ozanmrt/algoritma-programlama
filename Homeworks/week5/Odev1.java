/* *** Ödevi
 */
package w5;
import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Satır Sayısını Giriniz: ");
        int satir = input.nextInt();
        
          for (int i = satir; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
                
        
    }
    
}
