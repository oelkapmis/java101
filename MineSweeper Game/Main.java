/**
 * The Minesweeper console game.
 *
 * @author  Oguzhan Elkapmis
 * @date   2022-03-22
 * @github https://github.com/oelkapmis
 */

//  https://app.patika.dev/courses/java101/bitirme-mayin-tarlasi

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        launcher();
    }

    private static void launcher() {

        int row = 0, col = 0;
        Scanner scan = new Scanner(System.in);
        boolean invalidInput = true;

        do{
            try{
                System.out.print("Harita için satır sayısı: ");
                row = scan.nextInt();
                if(row < 2) throw new InputMismatchException();

                invalidInput = false;
            }
            catch (InputMismatchException e){
                System.out.println("İkiden büyük bir tam sayı değeri girmelisin!");
                scan.nextLine();
            }
        }while(invalidInput);

        invalidInput = true;

        do{
            try{
                System.out.print("Harita için sütun sayısı: ");
                col = scan.nextInt();
                if(col < 2) throw new InputMismatchException();

                invalidInput = false;
            }
            catch (InputMismatchException e){
                System.out.println("İkiden büyük bir tam sayı değeri girmelisin!");
                scan.nextLine();
            }
        }while(invalidInput);

        MineSweeper minesweeper = new MineSweeper(row, col);
        minesweeper.run();
    }
}
