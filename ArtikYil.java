/*
    https://app.patika.dev/moduller/java101/odev-artik-yil

    Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

    Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
    1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.

    100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
    Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

 */

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0) System.out.println("" + year + " bir artık yıldır!");
                else System.out.println("" + year + " bir artık yıldır değildir !");
            }
            else{
                System.out.println("" + year + " bir artık yıldır!");
            }
        }
        else{
            System.out.println("" + year + " bir artık yıldır değildir !");
        }
    }
}
