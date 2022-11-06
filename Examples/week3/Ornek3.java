/*Birden 10'a Kadar Olan Sayıların Toplamı
Adım 1: Başla
Adım 2: Toplam = 0
Adım 3: i = 1
Adım 4: Eğer i > 6 git Adım 8
Adım 5: toplam = toplam + i
Adım 6: i = i + 1
Adım 7: Git Adım 4
Adım 8: Ekrana Toplamı Yazdır
Adım 9: Bitir

Klavyeden Girilen Bir n Sayısına Göre Tek Sayıları Toplamını - Diyagramını - Algoritmasını
kareleri toplamı
 */
public class Ornek3 {

    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            toplam = toplam + i;
        }

        System.out.println("Toplam[1-5]: " + toplam);

    }

}
