/*
    https://app.patika.dev/moduller/java101/odev-ucak-bileti

    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

 */


import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        int km, age, type;
        double price, discount;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe: ");
        km = input.nextInt();
        if(km <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        System.out.print("Yasiniz: ");
        age = input.nextInt();
        if(age <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();
        if(!(type == 1 || type == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        price = km * 0.10;

        //age discount
        if(age < 12) discount = 0.5;
        else if(age <= 24) discount = 0.1;
        else if(age >= 65) discount = 0.3;
        else discount = 0;
        price -= (price * discount);

        //type discount
        if(type == 2){
            price -= (price * 0.2);
            price *= 2;
        }

        System.out.println("Toplam Tutar = " + price + " TL");

    }
}