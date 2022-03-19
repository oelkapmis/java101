//  https://app.patika.dev/moduller/java101/odev-recursive-power
//  taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
//  "Recursive" metot kullanarak yapan programı yazınız.

import java.util.Scanner;

public class PowerMethodWithRecursive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int base = scan.nextInt();
        System.out.print("Üs değerini girin: ");
        int power = scan.nextInt();
        int result = recursivePower(base, power);
        System.out.println("" + base + " üzeri " + power + " = " + result);

    }

    static int recursivePower(int base, int power){
        if(power == 1){
            return base;
        }
        return base * recursivePower(base, power-1);
    }
}
