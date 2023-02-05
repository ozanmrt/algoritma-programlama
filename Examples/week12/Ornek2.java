package week12;
import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();
        System.out.print("Harf Gir: ");
        char harf = input.nextLine().charAt(0);
        int sayac = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i)==harf) {
                System.out.println(i+1+". Harf");
                sayac++;
            }
        }
        System.out.println(sayac+" Tane "+harf+" Harfi Var.");
    }
    
}
