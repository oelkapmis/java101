/*
    https://app.patika.dev/moduller/java101/odev-recursive-pattern

    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra
    tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = scan.nextInt();

        pattern(n, n, false);
    }

    private static void pattern(int n, int current, Boolean flag) {
        System.out.println(current + " ");
        if(!flag){
            if(current > 0) pattern(n, current - 5, false);
            else pattern(n, current + 5, true);
        }
        else{
            if(current != n) pattern(n, current + 5, true);
        }
    }
}
