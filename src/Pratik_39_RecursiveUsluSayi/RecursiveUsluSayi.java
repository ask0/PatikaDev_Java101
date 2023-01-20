package Pratik_39_RecursiveUsluSayi;

import java.util.Scanner;

public class RecursiveUsluSayi {
    static int us(int taban, int kuvvet) {
        if (kuvvet == 0)
            return 1;
        return taban * us(taban, kuvvet - 1);
    }
    static Scanner scanner = new Scanner(System.in);
    static void usluSayiBul() {
        System.out.print("Taban değeri girin: ");
        int a = scanner.nextInt();
        System.out.print("Kuvvet değeri girin: ");
        int b = scanner.nextInt();
        System.out.print("Sonuç: " + us(a, b));
    }
    public static void main(String[] args) {
        usluSayiBul();
    }
}
