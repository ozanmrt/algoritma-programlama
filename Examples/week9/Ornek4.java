// Diziler
package week9;

import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Değeri: ");
        int n = input.nextInt();
        
        int[] dizi = new int[n];
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("dizi["+i+"]: ");
            dizi[i]=input.nextInt();
        }
        
        System.out.println("Dizinin Uzunluğu: "+dizi.length);
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi["+i+"]: "+dizi[i]);
        }
        
    }

}
