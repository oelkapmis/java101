//  https://app.patika.dev/moduller/java101/pratik-duplicate

public class FindDuplicatedNumbers {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 2, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] % 2 == 0 && i != j && list[i] == list[j] && !isContains(duplicate, list[i])) {
                    duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }
        print(list);
        print(duplicate);
    }

    private static void print(int[] list) {
        System.out.print("[ ");
        for (int element : list) {
            if (element == 0) break;
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    private static boolean isContains(int[] duplicate, int value) {
        for (int element : duplicate) {
            if (element == value) return true;
        }
        return false;
    }
}
