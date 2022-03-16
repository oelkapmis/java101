/*
    https://app.patika.dev/moduller/java101/pratik-cift-sayi-toplam

    Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
    tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class DongulerPratik1 {
    public static void main(String[] args) {
        int sum = 0, cnt = 0, n;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        n = input.nextInt();

        for(int i = 0; i <= n; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                cnt++;
            }
        }
        avg = (double)sum / cnt;
        System.out.println("Average = " + avg);
    }
}
