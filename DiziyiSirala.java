//  https://app.patika.dev/moduller/java101/odev-array-order

import java.util.Arrays;
import java.util.Scanner;

public class DiziyiSirala {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını girin");
        for(int i = 0; i < n; i++){
            System.out.print(i+1 + ". elemanı girin: ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralı dizi: " + Arrays.toString(arr));

    }
}
