//Harf Tahmin Oyunu

package w8;

import java.util.Random;
import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int rand = r.nextInt(26) + 96;
        char harf = (char) rand;

        for (int i = 10; i > 0; i--) {
            System.out.print("Harfi Tahmin Ediniz (Kalan Hakkınız: " + i + "): ");
            char tahmin = input.next().charAt(0);

            if (harf == tahmin) {
                System.out.println("Doğru Bildiniz");
                break;
            } else {
                System.out.println("Yanlış Tahmin");
            }
        }

    }
}
