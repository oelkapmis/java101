import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    boolean inGame;

    // MAP
    char[][] map; //cheat map for developer. (mines are visible)
    char[][] userMap; //this is the map the user interacts with. (mines are invisible)
    int[][] numberMap;
    char symbolEmpty;
    char symbolFilled;
    int rowNumber;
    int colNumber;

    // MINES
    int numOfMines;
    int[][] mineLocations;

    // USER
    int userRowPlacement;
    int userColPlacement;

    public MineSweeper(int rowNumber, int colNumber) {
        this.symbolEmpty = '-';
        this.symbolFilled = '*';
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.numOfMines = (rowNumber * colNumber) / 4;
        this.mineLocations = new int[numOfMines][2];
        //first index is for mine ID, second index is for row/col info
        //row info for 2nd mine -> mineLocations[2][0]
        //col info for 2nd mine -> mineLocations[2][1]

        // CREATE AND INITIALIZE THE EMPTY MAPS
        this.map = new char[rowNumber][colNumber];
        this.userMap = new char[rowNumber][colNumber];
        this.numberMap = new int[rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                this.map[i][j] = this.symbolEmpty;
                this.userMap[i][j] = this.symbolEmpty;
            }
        }

        // CREATE RANDOM MINES ON THE MAP
        int count = 0;
        while (count < this.numOfMines) {
            int i, j;
            Random rand = new Random();
            i = rand.nextInt(rowNumber);
            j = rand.nextInt(colNumber);
            if (isEmpty(i, j)) {
                this.map[i][j] = this.symbolFilled;
                this.mineLocations[count][0] = i;
                this.mineLocations[count][1] = j;
                count++;
            }
        }

        //After creation of mines, initialize the number map
        initNumberMap();
    }

    private void initNumberMap() {

        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++){
                int counter = 0;

                //UPPER LEFT
                if(inMapBounds(i-1, j-1) && this.map[i-1][j-1] == this.symbolFilled){
                    counter++;
                }
                //UPPER
                if(inMapBounds(i-1, j) && this.map[i-1][j] == this.symbolFilled){
                    counter++;
                }
                //UPPER RIGHT
                if(inMapBounds(i-1, j+1) && this.map[i-1][j+1] == this.symbolFilled){
                    counter++;
                }
                //LEFT
                if(inMapBounds(i, j-1) && this.map[i][j-1] == this.symbolFilled){
                    counter++;
                }
                //RIGHT
                if(inMapBounds(i, j+1) && this.map[i][j+1] == this.symbolFilled){
                    counter++;
                }
                //DOWN LEFT
                if(inMapBounds(i+1, j-1) && this.map[i+1][j-1] == this.symbolFilled){
                    counter++;
                }
                //DOWN
                if(inMapBounds(i+1, j) && this.map[i+1][j] == this.symbolFilled){
                    counter++;
                }
                //DOWN RIGHT
                if(inMapBounds(i+1, j+1) && this.map[i+1][j+1] == this.symbolFilled){
                    counter++;
                }

                this.numberMap[i][j] = counter;
            }
        }
    }

    private boolean inMapBounds(int row, int col) {
        return (row >= 0 && row < this.rowNumber && col >= 0 && col < this.colNumber);
    }

    private boolean isEmpty(int i, int j) {
        return this.map[i][j] == this.symbolEmpty;
    }

    public void printMap(boolean visibleMines) {

        if (visibleMines) {
            for (int i = 0; i < this.rowNumber; i++) {
                for (int j = 0; j < this.colNumber; j++) {
                    System.out.print(this.map[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < this.rowNumber; i++) {
                for (int j = 0; j < this.colNumber; j++) {
                    System.out.print(this.userMap[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    public void run() {

        inGame = true;

        System.out.println("Mayınların konumu:");
        printMap(true);

        System.out.println("Mayın Tarlası Oyununa Hoşgeldin !");
        do{
            printMap(false);
            getUserInput();
            placeUserInput();
        }while(inGame);
        printMap(false);
    }

    private void getUserInput() {

        Scanner scan = new Scanner(System.in);
        boolean invalidInput = true;

        do {
            try {
                System.out.print("Satır girin: ");
                this.userRowPlacement = scan.nextInt();
                if (this.userRowPlacement < 0 || this.userRowPlacement >= this.rowNumber) {
                    throw new InputMismatchException();
                }
                invalidInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Mayınları temizlemeden bu alandan çıkamazsın!");
                scan.nextLine();
            }
        }
        while (invalidInput);

        invalidInput = true;
        do {
            try {
                System.out.print("Sütun girin: ");
                this.userColPlacement = scan.nextInt();
                if (this.userColPlacement < 0 || this.userColPlacement >= this.colNumber) {
                    throw new InputMismatchException();
                }

                invalidInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Kaçamak yapamazsın, mayınları temizle!");
                scan.nextLine();
            }
        }
        while (invalidInput);

    }

    private void placeUserInput() {

        if(this.map[this.userRowPlacement][this.userColPlacement] == this.symbolFilled){
            this.userMap[this.userRowPlacement][this.userColPlacement] = this.symbolFilled;
            this.inGame = false;
            System.out.println("BUUUUMMM!!! ♫♪ PARAAAM PARÇAAAAA ♫♪");
        }
        else{
            if(this.userMap[this.userRowPlacement][this.userColPlacement] == this.symbolEmpty){
                int digit = this.numberMap[this.userRowPlacement][this.userColPlacement];
                this.userMap[this.userRowPlacement][this.userColPlacement] = Character.forDigit(digit, 10);

                if(isWin()){
                    System.out.println("Tebrikler, buradan sağ çıkmayı başardın!");
                    inGame = false;
                }
            }
            else{
                System.out.println("Aynı yere bakıp duruyorsun. Yoksa açılmaya korkuyor musun :)");
            }
        }
    }

    private boolean isWin() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if(this.userMap[i][j] == this.symbolEmpty && this.map[i][j] == this.symbolEmpty) return false;
            }
        }
        return true;
    }
}
