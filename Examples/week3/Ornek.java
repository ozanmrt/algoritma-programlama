/*
Adım 1: Başla
Adım 2: Sayı1,Sayı2 ve Sayi3 al
Adım 3: Eğer Sayi1>Sayi2 ve Sayi1>Sayi3 "Sayı1" yazdır.
Adım 4: Eğer Sayi2>Sayi1 ve Sayi2>Sayi3 "Sayı2" yazdır.
Adım 5: Eğer Sayi3>Sayi1 ve Sayi3>Sayi2 "Sayı3" yazdır.
Adım 6: Aksi Takdirde "En Büyük Sayı Yoktur" yazdır.
Adım 7: Bitir
*/

import java.util.Scanner;

public class Ornek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Sayıyı Giriniz: ");
        int s1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        int s2 = input.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        int s3 = input.nextInt();
    
        if (s1>s2 && s1>s3) {
            System.out.println("En Büyük Sayı: "+s1);
        }
        else if(s2>s1 && s2>s3){
            System.out.println("En Büyük Sayı: "+s2);
        }
        else if(s3>s1 && s3>s2){
            System.out.println("En Büyük Sayı: "+s3); 
        }
        else{
            System.out.println("En Büyük Sayı Yok");
            
            
        }
        
    }
    
}
