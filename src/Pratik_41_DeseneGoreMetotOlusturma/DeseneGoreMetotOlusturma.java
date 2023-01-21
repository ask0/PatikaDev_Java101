package Pratik_41_DeseneGoreMetotOlusturma;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static String desen(int x, int y) {
        if (x <= 0)
            return "0";
        return x + " " + desen(x - y, y) + " " + x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scanner.nextInt();
        System.out.println("Çıktısı: " + desen(n, 5));
    }
}
