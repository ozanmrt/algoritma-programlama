/*F(x)=x^2-5*x+3 Sonucuna Göre Negatif Pozitif Yaz

 */
package w4;

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, fonk;
        System.out.print("F(x)=x²-5x+3 Fonksiyonu İçin x Değerini Giriniz: ");
        x = input.nextInt();
        fonk = x * x - 5 * x + 3;

        if (fonk > 0) {
            System.out.println("Pozitif");
        } else if (fonk < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("0");
        }
    }

}
