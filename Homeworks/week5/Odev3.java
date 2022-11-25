/* S>7 ve 3a+5b=S 
 */
package w5;

import java.util.Scanner;

public class Odev3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        
        for (int i = 0; i <= sayi/3; i++) {
            
            for (int j = 0; j <= sayi/5; j++) {
                if (sayi == (3 * i) + (5 * j)) {
                    
                    System.out.println(sayi+" = 3*("+i+")+5*("+j+")");
                    
                }
            }
            
        }
        
    }
    
}
