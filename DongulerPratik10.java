//https://app.patika.dev/moduller/java101/pratik-ebob-ekok

import java.util.Scanner;

public class DongulerPratik10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayı: ");
        int n1 = input.nextInt();
        System.out.print("ikinci sayı: ");
        int n2 = input.nextInt();

        int ebob = ebob(n1, n2);
        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB(" + n1 + ", " + n2 + ") = " + ebob);
        System.out.println("EKOK(" + n1 + ", " + n2 + ") = " + ekok);

    }

    private static int ebob(int n1, int n2) {
        int ebob = 0;
        int i = Math.min(n1, n2);
        while(i > 0){
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        return ebob;
    }
}
