//  https://app.patika.dev/moduller/java101/odev-min-max

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("" + i + ". sayıyı girin: ");
            int num = input.nextInt();

            if(i == 1){
                max = num;
                min = num;
                continue;
            }

            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
