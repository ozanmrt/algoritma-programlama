//Taş Kağıt Makas Oyunu
package w11;

import java.util.Random;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rs = new Random();

        String[] secenek = {"Taş", "Kağıt", "Makas"};

        System.out.print("1: Taş\n2: Kağıt\n3: Makas\nSayı Giriniz [1-3]: ");
        int sayi = input.nextInt();

        while (sayi < 1 || sayi > 3) {
            System.out.print("Tekrar Giriniz [1-3]: ");
            sayi = input.nextInt();
        }
        
        String player = secenek[sayi - 1];
        String pc = secenek[rs.nextInt(3)];
        System.out.println("\nBilgisayarın Seçimi: "+pc+"\nOyuncunun Seçimi: "+player);
        
        if (player.equals(pc)) { // Beraberlik
            System.out.println("\nBerabere!");
        }
        else if ((player.equals("Taş") && pc.equals("Makas")) || (player.equals("Kağıt") && pc.equals("Taş")) || (player.equals("Makas") && pc.equals("Kağıt"))) { // Oyuncu Kazandı
            System.out.println("\nOyuncu Kazandı!");
        }
        else // Pc Kazandı
        {
            System.out.println("\nBilgisayar Kazandı!");
        }
        
    }
}
