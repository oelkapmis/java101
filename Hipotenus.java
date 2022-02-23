import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {


        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("birinci kenari giriniz: ");
        a = input.nextDouble();

        System.out.println("ikinci kenari giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("ucgenin hipotenusu: " + c + "\n\n\n");


        /*
        * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        * Formül
        * Üçgenin çevresi = 2𝑢
        * 𝑢 = (a+b+c) / 2
        * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        * */

        System.out.println("birinci kenari giriniz: ");
        a = input.nextDouble();

        System.out.println("ikinci kenari giriniz: ");
        b = input.nextDouble();

        System.out.println("ucuncu kenari giriniz: ");
        c = input.nextDouble();

        double u, cevre, alan;
        u = (a + b + c)/ 2;
        cevre = 2 * u;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("ucgenin alani: " + alan);

    }
}
