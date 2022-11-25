/* Girilen Pozitif Tamsayının Tersten Yazılmış Sayısal Değerini Bul

 */
package w4;
import java.util.Scanner;

public class Odev3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Gir: ");
        int sayi = input.nextInt();
        int k=0;
        
        while(sayi>0){
           k = k*10+sayi%10;
           sayi = sayi/10;
        }
        System.out.println(k);
        
    }
    
}
