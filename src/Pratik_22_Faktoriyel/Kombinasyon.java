package Pratik_22_Faktoriyel;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        System.out.println("C(n,r)");
        System.out.println("n girin: ");
        n = scanner.nextInt();
        System.out.println("r girin: ");
        r = scanner.nextInt();
        int a = 1, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        for (int i = 1; i <= r; i++) {
            b *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            c *= i;
        }
        System.out.println("Sonuç: " + (a / (b * c)));
    }
}
