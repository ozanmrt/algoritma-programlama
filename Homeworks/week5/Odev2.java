/*  sayi = (a*a) +(b*b)
 */
package w5;
import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        
        for (int i = 0; i <= sayi; i++) {
            
            for (int j = 0; j < sayi; j++) {
                
                if (sayi==(i*i)+(j*j)) {
                    
                   System.out.println(sayi+" = ("+i+"*"+i+")+("+j+"*"+j+")");
                   
                }
                
            }
            
        }
        
        
    }
    
}
