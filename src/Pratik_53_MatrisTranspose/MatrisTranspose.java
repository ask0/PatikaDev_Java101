package Pratik_53_MatrisTranspose;

import java.util.Scanner;

public class MatrisTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n girin: ");
        int n = scanner.nextInt();
        System.out.print("m girin: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] transpose = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " elemanını girin: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix: ");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose: ");
        for (int[] i : transpose) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
