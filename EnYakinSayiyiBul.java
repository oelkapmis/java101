//  https://app.patika.dev/moduller/java101/pratik-min-max

import java.util.Arrays;
import java.util.Scanner;
import static java.sql.Types.NULL;

public class EnYakinSayiyiBul {

    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scan.nextInt();
        int leftClosestDistance = Integer.MAX_VALUE;
        int rightClosestDistance = Integer.MAX_VALUE;
        int leftClosestNum = 0;
        int rightClosestNum = 0;
        boolean changedL = false, changedR = false;

        for(int i: list){
            if(num - i > 0){
                if(num - i <= leftClosestDistance){
                    leftClosestNum = i;
                    leftClosestDistance = num - i;
                    changedL = true;
                }
            }
            else if(num - i < 0){
                if(i - num <= rightClosestDistance){
                    rightClosestNum = i;
                    rightClosestDistance = i - num;
                    changedR = true;
                }
            }
        }

        System.out.println("En yakın küçük sayı: " + (changedL?leftClosestNum:"BULUNAMADI"));
        System.out.println("En yakın büyük sayı: " + (changedR?rightClosestNum:"BULUNAMADI"));

    }
}
