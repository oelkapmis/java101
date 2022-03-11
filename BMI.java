/*
    https://app.patika.dev/moduller/java101/odev-vucut-kitle-hesaplama

    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        double boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuz (metre): ");
        boy = input.nextDouble();
        System.out.println("Kutleniz (kilogram): ");
        kilo = input.nextDouble();

        System.out.println("Vucut kitle indeksiniz: " + kilo / (boy * boy));
    }
}
