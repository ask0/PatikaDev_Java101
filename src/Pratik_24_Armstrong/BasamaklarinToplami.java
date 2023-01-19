package Pratik_24_Armstrong;

import java.util.Scanner;

public class BasamaklarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı girin: ");
        sayi = scanner.nextInt();
        int basamak = 1;
        int islem = sayi / basamak;
        int toplam = 0;
        while (islem != 0) {
            toplam += islem % 10;
            basamak *= 10;
            islem /= 10;
        }
        System.out.println("Sayı değerleri toplamı: " + toplam);
    }
}
