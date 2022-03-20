//  https://app.patika.dev/moduller/java101/pratik-array-ortalama

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double harmonikSeri = harmonikSeri(numbers.length);
        double harmonikOrt = numbers.length / harmonikSeri;

        System.out.println("Aritmetik ortalama: " + sum / numbers.length);
        System.out.println("Harmonik seri: " + harmonikSeri);
        System.out.println("Harmonik ortalama: " + harmonikOrt);
    }

    private static double harmonikSeri(int n) {
        double harmonikSeri = 0;
        for(int i = 1; i <= n; i++){
            harmonikSeri += 1.0 / (i);
        }
        return harmonikSeri;
    }
}

