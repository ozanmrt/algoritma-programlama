package week12;
import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Text Gir: ");
        String txt = input.nextLine();
        char ch='A';
        System.out.println((int)ch);
        System.out.println(txt+" "+txt);
        System.out.println(txt.charAt(0));
        
        for (int i = 0; i < txt.length(); i++) {
            System.out.println((i+1)+". Harfi: "+txt.charAt(i));
        }
        
        if (txt.equals("Emrah")) {
            System.out.println("Evet");
        }
        else{
            System.out.println("Hayır");
        }
    }
    
}
