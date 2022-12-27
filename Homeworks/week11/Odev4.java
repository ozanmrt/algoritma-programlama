//Sesli Harflerini Ayrı Sessiz Harflerini Ayrı Yazdırma
package w11;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cumle Gir: ");
        String text = input.nextLine();

        char dizi[] = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

        String k1 = "", k2 = "";
        boolean durum;
        for (int i = 0; i < text.length(); i++) {
            durum = false;
            for (int j = 0; j < dizi.length; j++) {
                if (text.charAt(i) == dizi[j]) {
                    durum = true;
                    break;
                }
            }
            if (durum) {
                k1 += text.charAt(i);
            } else {
                k2 += text.charAt(i);
            }
        }

        System.out.println(k1 + "\n" + k2);
    }
}
