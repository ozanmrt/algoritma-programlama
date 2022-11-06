import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b,c,toplam,carpim;
       double ort;
       
       System.out.print("1. Sayı: ");
       a = input.nextInt();
       System.out.print("2. Sayı: ");
       b = input.nextInt();
       System.out.print("3. Sayı: ");
       c = input.nextInt();

       toplam = a+b+c;
       carpim = a*b*c;
       
       ort = (double)toplam/3;
       System.out.println("Toplam: "+toplam);
       System.out.println("Çarpım: "+carpim);
       System.out.println("Ortalama: "+ort);
    }
    
}
