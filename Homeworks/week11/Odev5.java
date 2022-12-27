//Elektronik > rtokneilkE
package w11;

import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();
        int n = text.length() / 2;

        for (int i = 0; i < n; i++) {
            System.out.print(text.charAt(n + i));
            System.out.print(text.charAt(n - 1 - i));
        }

    }
}
