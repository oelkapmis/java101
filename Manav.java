/*
    https://app.patika.dev/moduller/java101/odev-manav-kasa

    Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
 */

import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {

        double priceArmut = 2.14;
        double priceElma = 3.67;
        double priceDomates = 1.11;
        double priceMuz = 0.95;
        double pricePatlican = 5.0;
        double tutar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kac kilo? ");
        tutar += priceArmut * input.nextDouble();
        System.out.println("Elma kac kilo? ");
        tutar += priceElma * input.nextDouble();
        System.out.println("Domates kac kilo? ");
        tutar += priceDomates * input.nextDouble();
        System.out.println("Muz kac kilo? ");
        tutar += priceMuz * input.nextDouble();
        System.out.println("Patlican kac kilo? ");
        tutar += pricePatlican * input.nextDouble();

        System.out.println("Toplam tutar: " + tutar + " TL");

    }


}
