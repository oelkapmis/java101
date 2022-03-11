/*
    https://app.patika.dev/moduller/java101/pratik-taksimetre

    Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
 */

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        double chargePerKm = 2.2;
        double total = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Kac km yol gittiniz: ");
        int km = input.nextInt();

        total += km * chargePerKm;
        total = (total < 20)? 20: total;
        System.out.println("Toplam ucret: " + total + " TL");

    }
}
