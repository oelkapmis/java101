//  https://app.patika.dev/moduller/java101/pratik-duplicate

public class FrekansBulma {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[][] doneList = new int[list.length][2];
        int currentIndex = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 0;

            if (!(isContain(doneList, list[i]))) {

                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) count++;
                }
                doneList[currentIndex][0] = list[i];
                doneList[currentIndex][1] = count;
                currentIndex++;
            }
        }

        print(doneList);
    }

    private static void print(int[][] doneList) {
        for (int i = 0; i < doneList.length; i++) {
            if(doneList[i][0] == 0) break;
            System.out.println(doneList[i][0] + " sayısı " + doneList[i][1] + " kere tekrar edildi.");
        }
    }

    private static boolean isContain(int[][] doneList, int value) {
        for (int[] ints : doneList) {
            if (value == ints[0]) return true;
        }
        return false;
    }

}
