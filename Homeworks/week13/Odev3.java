// Dizi Sıralama
package w13;

public class Odev3 {

    public static void main(String[] args) {

        int[] dizi = {7, 32, 1,12,10,325,23,31,1,0};
        
        DiziSirala(dizi);

    }

    public static void DiziSirala(int[] dizi) {

        int gecici;
        
         for(int i = 0; i < dizi.length-1; i++)
        {
            for(int j = i+1; j < dizi.length; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < dizi.length; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". Elemanı: " + dizi[i]);
        }
        

    }

}
