package Pratik_57_MinerSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinerSweeper {
    int col;
    int row;

    MinerSweeper(int row, int col) {
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

        Arrays.sort(randomArray);
        /// print randomArray

        for (int i = 0; i < count; i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();


        // Sorting random indexes
        // Puts randoms into matrix as 1
        count = 0;
        int index = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (count < randomArray.length) {
                    if (index == randomArray[count]) {
                        mineMatrix[i][j] = 1;
                        count++;
                    }
                }
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


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mineMatrix[i][j] == 1)
                    System.out.print("*\t");
                else
                    System.out.print("-\t");
            }
            System.out.println();
        }

        int rows = row - 1;
        int cols = col - 1;
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Enter row and column between row: [0-" + rows + "] col: [0-" + cols + "]");
            System.out.print("Row: ");
            int r = scanner.nextInt();
            System.out.print("Col: ");
            int c = scanner.nextInt();
            if (r < 0 || c < 0 || r > rows || c > cols) {
                System.out.println("Wrong input. Try again.");
            } else {

            }
        }
    }


    public static void main(String[] args) {
        MinerSweeper minerSweeper = new MinerSweeper(3, 6);
        minerSweeper.run();
    }
}
