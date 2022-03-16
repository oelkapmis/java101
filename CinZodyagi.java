/*
    https://app.patika.dev/moduller/java101/odev-cin-zodyagi

    Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

    Çin Zodyağı nedir?
    4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

    Çin Zodyağı nasıl hesaplanır?
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünden kalana göre bulunur.

 */

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int birthyear;
        String sign = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        birthyear = input.nextInt();

        switch (birthyear % 12) {
            case 0 -> sign = "Maymun";
            case 1 -> sign = "Horoz";
            case 2 -> sign = "Köpek";
            case 3 -> sign = "Domuz";
            case 4 -> sign = "Fare";
            case 5 -> sign = "Öküz";
            case 6 -> sign = "Kaplan";
            case 7 -> sign = "Tavşan";
            case 8 -> sign = "Ejderha";
            case 9 -> sign = "Yılan";
            case 10 -> sign = "At";
            case 11 -> sign = "Koyun";
            default -> System.exit(0);
        }
        System.out.println("Çin Zodyağı Burcunuz: " + sign);

    }
}
