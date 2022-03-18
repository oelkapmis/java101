//  https://app.patika.dev/moduller/java101/odev-asal-sayi
//  Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

public class AsalSayilar {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++){
            if(isPrime(i))
                System.out.print(""+ i + ", ");
        }

    }

    private static boolean isPrime(int num) {
        int count = 0;

        for(int i = 2; i <= num; i++) {
            if(num % i == 0) count++;
            if(count > 1) break;
        }

        return count == 1;
    }
}
