//  https://app.patika.dev/moduller/java101/pratik-hesap-mak-1
//  Videodaki hesap makinesini switch-case kullanarak yapınız.

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-)Toplama\n2-)Cikarma\n3-)Carpma\n4-)Bolme");
        select = input.nextInt();

        switch(select){

            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if(n2 == 0) System.out.println("Sayi sifira bolunemez!");
                else System.out.println(n1/n2);
                break;
            default:
                System.out.println("Yanlis secim yaptiniz!");
        }
    }
}
