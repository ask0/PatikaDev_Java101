package Pratik_31_TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= row * 2 - (2 * i) + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
