import java.util.Scanner;

public class Example2 {


    public static void main(String[] args) {
       
      float fh,cc;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Fh Giriniz: ");
      fh = input.nextFloat();
      //°C = (°F – 32) / 1.8
      cc = (fh-32)/1.8f;
      System.out.println("Celcius Değeri: "+cc);  
    }  
}
