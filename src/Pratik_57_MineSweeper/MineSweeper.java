package Pratik_57_MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int col;
    int row;

    MineSweeper(int row, int col) {
        this.col = col;
        this.row = row;
    }

    static Scanner scanner = new Scanner(System.in);

    int[][] createRandomMineMatrix() {
        Random random = new Random();
        int[][] mineMatrix = new int[this.row][this.col];
        int[] randomArray = new int[this.row * this.col / 4];

        // Create non-repeat random array
        int count = 0;
        while (count < randomArray.length) {
            if (count == 0) {
                randomArray[count++] = random.nextInt((this.row * this.col));
            } else {
                boolean check = false;
                while (!check) {
                    int checkRandom = random.nextInt((this.row * this.col));
                    for (int i = 0; i < count; i++) {
                        if (checkRandom != randomArray[i]) {
                            check = true;
                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        randomArray[count++] = checkRandom;
                    }
                }

            }
        }

        // Sorting random indexes
        Arrays.sort(randomArray);

        /// print randomArray
        for (int i = 0; i < count; i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("\n##################################################");


        // Puts randoms into matrix as 1
        count = 0;
        int index = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (count < randomArray.length) {
                    if (index == randomArray[count]) {
                        mineMatrix[i][j] = -1;
                        count++;
                    } else {
                        mineMatrix[i][j] = -5;
                    }
                } else //if (count >= randomArray.length)
                    mineMatrix[i][j] = -5;
                index++;
            }
        }
        return mineMatrix;
    }


    void run() {
        int[][] mineMatrix = createRandomMineMatrix();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(mineMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("##################################################");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mineMatrix[i][j] == -1)
                    System.out.print("*\t");
                else
                    System.out.print("-\t");
            }
            System.out.println();
        }

        int rows = row - 1;
        int cols = col - 1;
        boolean isContinue = true;

        int loopCounter = 0;
        while (isContinue) {
            //   boolean isWin = true;
            System.out.println("##################################################\nEnter row and column between row: [0-" + rows + "] col: [0-" + cols + "]");
            System.out.print("Row: ");
            int r = scanner.nextInt();
            System.out.print("Col: ");
            int c = scanner.nextInt();
            if (r < 0 || c < 0 || r > rows || c > cols) {
                System.out.println("Wrong input. Try again.\n##################################################");
            } else {
                // while (true) { // isWin
                if (mineMatrix[r][c] == -1) {
                    System.out.println("You've lost. Game over.");
                    //isWin = false;
                    isContinue = false;
                } else if (mineMatrix[r][c] == -5) {
                    int neighbour = 0;
                    if (r == 0 && c == 0) { // top left
                        if (mineMatrix[r + 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r][c + 1] == -1)
                            neighbour++;
                    } else if (r == row - 1 && c == 0) {  // bottom left
                        if (mineMatrix[r - 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c + 1] == -1)
                            neighbour++;
                    } else if (r == row - 1 && c == col - 1) {  // bottom right
                        if (mineMatrix[r][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c - 1] == -1)
                            neighbour++;
                    } else if (r == 0 && c == col - 1) {  // top right
                        if (mineMatrix[r][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c - 1] == -1)
                            neighbour++;
                    } else if (r == 0 && c < col - 1) {  // top-mid
                        if (mineMatrix[r][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c + 1] == -1)
                            neighbour++;
                    } else if (r == row - 1 && c > 0 && c < col - 1) {  // bottom-mid
                        if (mineMatrix[r][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c + 1] == -1)
                            neighbour++;
                    } else if (r > 0 && r < row - 1 && c == 0) {  // left-mid
                        if (mineMatrix[r - 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c + 1] == -1)
                            neighbour++;
                    } else if (r > 0 && r < row - 1 && c == col - 1) {  // right-mid
                        if (mineMatrix[r][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c] == -1)
                            neighbour++;
                    } else { // rest of the indexes
                        if (mineMatrix[r - 1][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c - 1] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c] == -1)
                            neighbour++;
                        if (mineMatrix[r - 1][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r][c + 1] == -1)
                            neighbour++;
                        if (mineMatrix[r + 1][c + 1] == -1)
                            neighbour++;
                    }

                    mineMatrix[r][c] = neighbour;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (mineMatrix[i][j] >= 0)
                                System.out.print(mineMatrix[i][j] + "\t");
                            else System.out.print("-\t");
                        }
                        System.out.println();
                    }
                }
                loopCounter++;
                //isWin = false;
                if (loopCounter == row * col - (row * col / 4)) {
                    System.out.println("Congrats. You win!");
                    isContinue = false;
                }
                //   break;
                // }
            }
        }
    }

    public static void main(String[] args) {
        MineSweeper mineSweeper = new MineSweeper(4, 6);
        mineSweeper.run();
    }
}