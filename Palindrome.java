//  https://app.patika.dev/moduller/java101/pratik-palindrom

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = input.nextInt();

        if(isPalindrome(num))
            System.out.print("PALINDROM");
        else
            System.out.print("PALINDROM DEGIL");
    }

    private static boolean isPalindrome(int num) {
        int temp = num, reversed = 0, lastDigit;

        while(temp != 0){
            lastDigit = temp % 10;
            temp /= 10;
            reversed *= 10;
            reversed += lastDigit;
        }
        return reversed == num;
    }
}
