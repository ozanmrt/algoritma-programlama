package week12;
import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();
        for (int i = txt.length()-1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }
        System.out.println();
    }
    
}
