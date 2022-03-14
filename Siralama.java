/*
    https://app.patika.dev/moduller/java101/pratik-sayi-siralama

    Ödev
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */

import java.util.Scanner;

public class Siralama {

    public static void main(String[] args) {

        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayi: ");
        a = input.nextInt();
        System.out.print("Ikinci sayi: ");
        b = input.nextInt();
        System.out.print("Ucuncu sayi: ");
        c = input.nextInt();

        if(a < b && a < c){
            if(b < c){
                System.out.println("a < b < c");
            }
            else{
                System.out.println("a < c < b");
            }
        }
        else if(b < a && b < c){
            if(a < c){
                System.out.println("b < a < c");
            }
            else{
                System.out.println("b < c < a");
            }
        }
        else{
            if(a < b){
                System.out.println("c < a < b");
            }
            else{
                System.out.println("c < b < a");
            }
        }

    }
}
