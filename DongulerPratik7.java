
//https://app.patika.dev/moduller/java101/pratik-harmonic

import java.util.Scanner;

public class DongulerPratik7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        double harmonic = 0;

        for(int i = 1; i <= n; i++){
            harmonic += 1.0/i;
        }
        System.out.println("" + n + " sayısının harmonik değeri: " + harmonic);
    }
}
