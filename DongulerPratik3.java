/*
    https://app.patika.dev/moduller/java101/pratik-two-power

    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

import java.util.Scanner;

public class DongulerPratik3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("n degerini girin: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i *= 4) System.out.print(i + "\t");
        System.out.println();
        for(int i = 1; i <= n; i *= 5) System.out.print(i + "\t");
    }
}
