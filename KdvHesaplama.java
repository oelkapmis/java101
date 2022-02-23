import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {

        double kdv1 = 1.18;
        double kdv2 = 1.08;
        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz: ");
        tutar = input.nextDouble();

        System.out.println("KDV'siz fiyat: " + tutar);
        if(tutar < 1000){
            System.out.println("KDV'li fiyat: " + tutar * kdv1);
            System.out.println("KDV tutari: " + ((tutar * kdv1) - tutar));
        }
        else{
            System.out.println("KDV'li fiyat: " + tutar * kdv2);
            System.out.println("KDV tutari: " + ((tutar * kdv2) - tutar));
        }

    }
}
