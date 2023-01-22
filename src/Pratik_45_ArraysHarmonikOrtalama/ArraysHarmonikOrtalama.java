package Pratik_45_ArraysHarmonikOrtalama;

import java.util.Scanner;

public class ArraysHarmonikOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        double n = scanner.nextDouble();
        double sum = 1;
        for (double i = 2; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println("Harmonik ortalama: " + sum);
    }
}
