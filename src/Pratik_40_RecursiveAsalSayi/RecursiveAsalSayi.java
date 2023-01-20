package Pratik_40_RecursiveAsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean asalMi(int sayi, int bolum) {
        if (sayi <= 2)
            return (sayi == 2) ? true : false;
        if (sayi == bolum)
            return true;
        if (sayi % bolum == 0)
            return false;
        return asalMi(sayi, bolum + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int x = scanner.nextInt();
        System.out.println(asalMi(x, 2));
    }
}
