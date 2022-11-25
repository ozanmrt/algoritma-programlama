package week4;
/*
Adım 1: Başla
Adım 2: Kullanıcıdan N Değerini Al (n)
Adım 3: i = 1, carpim = 1
Adım 4: i > n ise git Adım 8
Adım 5: carpim = carpim * i
Adım 6: i = i + 1
Adım 7: git Adım 4
Adım 8: Ekrana Sonucu Yazdır
Adım 9: Bitir

*/



import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, carpim=1;

        System.out.print("N Sayısını Giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
           
            carpim*=i;

        }

        System.out.println(n+"!: " + carpim);

    }

}
