/*
    https://app.patika.dev/moduller/java101/pratik-sinif-gecme

    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

    Geçme Notu : 55

    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */

import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {

        int mat, fiz, tur, kim, muz;
        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuzu girin: ");
        mat = input.nextInt();
        System.out.print("fizik notunuzu girin: ");
        fiz = input.nextInt();
        System.out.print("turkce notunuzu girin: ");
        tur = input.nextInt();
        System.out.print("kimya notunuzu girin: ");
        kim = input.nextInt();
        System.out.print("muzik notunuzu girin: ");
        muz = input.nextInt();

        double avg = 0;
        int cnt = 0;
        if(mat >= 0 && mat <= 100){
            avg += mat;
            cnt++;
        }
        if(tur >= 0 && tur <= 100){
            avg += tur;
            cnt++;
        }
        if(fiz >= 0 && fiz <= 100){
            avg += fiz;
            cnt++;
        }
        if(kim >= 0 && kim <= 100){
            avg += kim;
            cnt++;
        }
        if(muz >= 0 && muz <= 100){
            avg += muz;
            cnt++;
        }
        avg /= cnt;

        System.out.println("Ortalama Notunuz = " + avg);
        if(avg >= 55){
            System.out.println("Tebrikler, gectiniz!");
        }
        else{
            System.out.println("Maalesef kaldiniz!");
        }


    }
}
