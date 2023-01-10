//NxN Dizisindeki her satırı kendi arasında sırala
package w12;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("N Değerini Giriniz: ");
        int n = input.nextInt();
        System.out.println("M Değerini Giriniz: ");
        int m = input.nextInt();

        int[][] a = new int[n][m];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) { // Diziyi Doldur
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt();
                b[j]=a[i][j];
            }
            
            
            
            
        }
        
        int[] c = {2,35,1,25,5,8};
        
        //System.out.println(c.Sort());
        

    }

}
