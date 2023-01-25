package Pratik_57_MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        while(true){
            System.out.print("Enter row number: ");
            row = scanner.nextInt();
            System.out.print("Enter col number: ");
            col = scanner.nextInt();
            if(row > 0 && col > 0)
                break;
            else System.out.println("Wrong input. Numbers must be positive.");
        }

        MineSweeper mineSweeper = new MineSweeper(row, col);
        mineSweeper.run();
    }
}
