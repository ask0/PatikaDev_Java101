package Pratik_24_Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, basamak = 1, count = 0;
        System.out.print("Bir sayı girin: ");
        sayi = scanner.nextInt();
        int islem = sayi / basamak;
        int toplam = 0;
        //basamak sayısı
        while (true) {
            if (islem == 0)
                break;
            else {
                basamak *= 10;
                islem /= 10;
                count++;
            }
        }
        System.out.println("Sayı " + count + " basamaklıdır.");
        basamak = 1;
        islem = sayi / basamak;
        //her bir basamağındaki rakam
        while (islem != 0) {
            System.out.println(basamak + "ler basamağı: " + islem % 10);
            toplam += Math.pow(islem % 10, count);
            System.out.println(toplam);
            basamak *= 10;
            islem /= 10;
        }
        if(toplam == sayi){
            System.out.println(sayi + " sayısı armstrong sayısıdır.");
        }
        else {
            System.out.println(sayi + " sayısı armstrong sayısı değildir.");
        }

    }
}
