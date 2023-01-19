package Pratik_26_YildizElmas;

import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n girin: ");
        n = 2 * scanner.nextInt() - 1; // n => toplam satır
        int row = n;
        for (int i = 1; i <= row; i++) {
            if (i <= row / 2 + 1) {
                for (int j = 0; j < row / 2 - i + 1; j++) {
                    System.out.print("-");
                }
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < i - (row / 2) - 1; j++) {
                    System.out.print("-");
                }
                for (int k = 0; k < (row - i) * 2 + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
