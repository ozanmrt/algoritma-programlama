import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
     
        int km, m;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen Hesaplanmasını İstediğiniz Km Değerini Giriniz: ");     
        km = input.nextInt();
        m = km * 1000;
        System.out.println("Metre Değeri: "+m);
    }
    
}
