/*
    https://app.patika.dev/moduller/java101/pratik-daire-alan-cevre

    Dairenin Alanını ve Çevresini Hesaplayan Program
    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

    Alan Formülü : π * r * r;

    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360
 */


import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        double r;
        double aci;
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yaricap giriniz: ");
        r = input.nextDouble();
        System.out.println("Merkez acisini derece cinsinden giriniz: ");
        aci = input.nextDouble();

        System.out.println("Yaricapi " + r + " olan dairenin alani: " + (PI * r * r));
        System.out.println("Yaricapi " + r + " olan dairenin cevresi: " + (2 * PI * r));
        System.out.println("Yaricapi " + r + ", merkez acisi " + aci +" derece olan daire diliminin alani: " + ((PI * (r*r) * aci) / 360));

    }
}
