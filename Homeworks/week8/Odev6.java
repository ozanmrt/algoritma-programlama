//Floyd Üçgeni

package w8;

import java.util.Scanner;

public class Odev6 {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
    
        System.out.print("Satır Sayısını Giriniz: ");
        int n = input.nextInt();
        int a=1;
      
       
     
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
              System.out.print(a+" ");  
              a++;
            }
            System.out.println(); 
            
        }
    }
}
