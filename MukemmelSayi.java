import java.util.Scanner;

/*
    https://app.patika.dev/moduller/java101/odev-mukemmel-sayi
    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
    ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan
    programı Java dilinde yazınız.

    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
    toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/
public class MukemmelSayi {
    public static void main(String[] args) {

        int num, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı girin: ");
        num = input.nextInt();

        for(int i = 1; i < num; i++){
            if(num % i == 0)
                total += i;
        }
        if(num == total)
            System.out.println("" + num + " sayısı bir mükemmel sayıdır!");
        else
            System.out.println("" + num + " sayısı bir mükemmel sayı DEĞİLDİR!");
    }
}
