//  https://app.patika.dev/moduller/java101/odev-array-transpose

public class MatrisTranspoz {
    public static void main(String[] args) {

        //[m x n]
        int[][] matris =
                {{4, 5, 6},
                {7, 8, 9}};

        int m = matris.length;
        int n = matris[0].length;

        int[][] transpoz = transpozunuAl(matris, m, n);

        print(matris);
        print(transpoz);
    }

    private static void print(int[][] matris) {
        int m = matris.length;
        int n = matris[0].length;

        System.out.println("======================");
        System.out.println(m + "x" + n + " matris:\n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpozunuAl(int[][] matris, int m, int n) {

        int[][] transpoz = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        return transpoz;
    }
}
