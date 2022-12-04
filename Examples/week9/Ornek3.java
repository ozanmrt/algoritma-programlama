//(2k+2)/(2k+1)!
package week9;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n Sayısını Giriniz: ");
        int n = input.nextInt();
        double toplam = 0;
       /* for (int i = 2; i <= (n-2)/2; i+=2) {
            int fakt = 1;
            for (int j = i; j <= i-1; j++) {
                fakt *= j;
            }
            toplam += i/fakt; 
        }*/
       
        for (int i = 0; i <= n; i++) {
            int temp=2*i+1;
            int fakt=1;
            for (int j = 1; j <= temp; j++) {
                fakt*=j;
            }
            toplam+=(double)(temp+1)/fakt;
        }
       
        System.out.println("Sonuç: " + toplam);
    }
}
