/*
    https://app.patika.dev/moduller/java101/pratik-etkinlik-onerme

    Koşullar :

    Sıcaklık 5'ten küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

 */


import java.util.Scanner;

public class HavaSicakligi {

    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik giriniz: ");
        heat = input.nextInt();

        switch ((heat < 5) ? 0 :
                (heat >= 5 && heat < 15) ? 1 :
                        (heat >= 15 && heat <= 25) ? 2 : 3) {
            case 0 -> System.out.println("Kayak yapabilirsiniz.");
            case 1 -> System.out.println("Sinemaya gidebilirsiniz.");
            case 2 -> System.out.println("Piknige gidebilirsiniz.");
            case 3 -> System.out.println("Yuzmeye gidebilirsiniz");
        }

    }
}
