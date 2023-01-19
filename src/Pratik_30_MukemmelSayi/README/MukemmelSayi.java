package Pratik_30_MukemmelSayi.README;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0, sayi;
        System.out.println("Sayı girin: ");
        sayi = scanner.nextInt();
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0)
                toplam += i;
        }
        if (toplam == sayi)
            System.out.println(sayi + " mükemmel sayıdır.");
        else
            System.out.println(sayi + " mükemmel sayı değildir.");
    }
}
