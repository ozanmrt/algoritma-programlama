//Fibonacci Serisinin İlk N Terimi
package w8;

import java.util.Scanner;

public class Odev8 {

    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
    
        System.out.print("Terim Sayısını Giriniz: ");
        int x = input.nextInt();
        int a=0;
        int b=1;
        int c=1;
      
        for (int i = 1; i < x; i++) {
            System.out.print(a+"-");
            c=a;
            a=b;
            b+=c;
            
        }
    }
}
