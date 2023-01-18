package Pratik_23_UsluSayi;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Üssü alınacak sayı: ");
        a = scanner.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = scanner.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.print("Sonuç: " + sonuc);
    }
}
