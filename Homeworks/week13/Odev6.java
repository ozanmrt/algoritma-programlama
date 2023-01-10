// Artarak Giden Yıldız

package w13;
import java.util.Scanner;

public class Odev6 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Satır Sayısını Giriniz: ");
        Yildiz(input.nextInt());
        
        
    }
    
    public static void Yildiz(int n){
    
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    
    }
}
