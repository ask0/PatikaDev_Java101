package Pratik_32_AsalSayiBulma;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.print("Sayı girin: ");
        sayi = scanner.nextInt();
        System.out.println("1-" + sayi + " arasındaki asal sayılar: ");
        for (int i = 2; i <= sayi; i++) {
            boolean isAsal = true;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    isAsal = false;
                }
                if (i == j && isAsal) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
