// 100-199 Arasındaki Armstrong Sayıları
package w8;

public class Odev19 {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int s = i;
            double T = 0;
            while (s > 0) {
                int k = s % 10;
                s = s / 10;
                double x = Math.pow(k, 3);
                T = T + x;
            }
            if (T == i) {
                System.out.print(i + " ,");
            }
        }
    }

}
