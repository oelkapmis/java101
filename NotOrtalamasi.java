import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        int mat, fizik, kimya, tarih;
        String sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuz:");
        mat = input.nextInt();

        System.out.println("fizik notunuz:");
        fizik = input.nextInt();

        System.out.println("kimya notunuz:");
        kimya = input.nextInt();

        System.out.println("tarih notunuz:");
        tarih = input.nextInt();

        int toplam = mat + fizik + kimya + tarih;
        double ortalama = toplam / 4.0;

        System.out.println("Ortalamaniz: " + ortalama);

        sonuc = (ortalama > 60)? "Sinifi gectiniz!" : "Sinifta kaldiniz!";
        System.out.println(sonuc);

    }
}
