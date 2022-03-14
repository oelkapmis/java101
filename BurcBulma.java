/*
    https://app.patika.dev/moduller/java101/pratik-burclar

    Ödev
    Aynı örneği switch-case kullanmadan yapınız.

 */

import java.util.Scanner;

public class BurcBulma {

    public static void main(String[] args) {

        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        String sign="";

        if (month == 1) {
            if (day <= 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        }
        else if (month == 2) {
            if (day <= 19)
                sign = "Aquarius";
            else
                sign = "Pisces";
        }
        else if(month == 3) {
            if (day <= 21)
                sign = "Pisces";
            else
                sign = "Aries";
        }
        else if (month == 4) {
            if (day <= 20)
                sign = "Aries";
            else
                sign = "Taurus";
        }
        else if (month == 5) {
            if (day < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        }
        else if(month == 6) {
            if (day <= 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        }
        else if (month == 7) {
            if (day <= 23)
                sign = "Cancer";
            else
                sign = "Leo";
        }
        else if( month == 8) {
            if (day <= 23)
                sign = "Leo";
            else
                sign = "Virgo";
        }
        else if (month == 9) {
            if (day <= 23)
                sign = "Virgo";
            else
                sign = "Libra";
        }
        else if (month == 10) {
            if (day <= 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        }
        else if (month == 11) {
            if (day <= 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        }
        else if (month == 12) {
            if (day <= 22)
                sign = "Sagittarius";
            else
                sign ="Capricorn";
        }
        System.out.println("The astrological sign for " + day + "/" + month + " is " + sign );
    }
}
