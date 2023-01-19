package Pratik_29_EnBuyukEnKucukSayi;

import java.util.Scanner;

public class EnBuyukEnKucukSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max, min, sayi;
        int count;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = scanner.nextInt();
        System.out.print("1. sayıyı girin: ");
        max = scanner.nextInt();
        min = max;
        for (int i = 2; i <= count; i++) {
            System.out.print(i + ". sayıyı girin: ");
            sayi = scanner.nextInt();
            if (max < sayi)
                max = sayi;
            if (min > sayi)
                min = sayi;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
