package Pratik_57_MinerSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinerSweeper {
    int col;
    int row;

    MinerSweeper(int col, int row) {
        this.col = col;
        this.row = row;
    }

    static Scanner scanner = new Scanner(System.in);

    int[][] createRandomMineMatrix(int[][] m) {
        Random random = new Random();
        int[][] matrix = new int[this.row][this.col];
        int[][] mineMatrix = new int[this.row][this.col];
        int[] randomArray = new int[this.row * this.col / 4];

        // Nonrepeat random
        int count = 0;
        while (count < randomArray.length) {
            if (count == 0) {
                randomArray[count++] = random.nextInt((this.row * this.col));
            } else {
                int checkRandom = random.nextInt((this.row * this.col));
                for (int i = 0; i < count; i++) {
                    if (!(checkRandom == randomArray[count])) {
                        randomArray[count++] = checkRandom;
                    }
                }
            }
        }
        System.out.println(randomArray[0]);
        Arrays.sort(randomArray); // Sorting random indexes
        // Puts randoms into matrix as 1
        count = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (index == randomArray[count]) {
                    mineMatrix[i][j] = randomArray[count++];
                }
                index++;
            }
        }
        return mineMatrix;
    }

    void run() {
        int[][] matrix = new int[this.row][this.col];
        int[][] mineMatrix = createRandomMineMatrix(matrix);
        for (int i = 0; i < mineMatrix.length; i++) {
            for (int j = 0; j < mineMatrix[0].length; j++) {
                System.out.print(mineMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MinerSweeper minerSweeper = new MinerSweeper(3, 5);
        minerSweeper.run();
    }
}
