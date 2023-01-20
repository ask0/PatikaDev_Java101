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
        try {
            boolean isContinue = true;
            while (isContinue) {
                System.out.print("Taban değeri girin: ");
                int a = scanner.nextInt();
                System.out.print("Kuvvet değeri girin: ");
                int b = scanner.nextInt();
                if (a < 0 || b < 0) {
                    System.out.println("0'dan büyük bir sayı girin.");
                } else {
                    System.out.print("Sonuç: " + us(a, b));
                    isContinue = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Hatalı giriş. Sayı girin.");
        }
    }

    public static void main(String[] args) {
        usluSayiBul();
    }
}
