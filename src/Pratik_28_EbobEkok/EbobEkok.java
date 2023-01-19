package Pratik_28_EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 1, n2 = 1;

        boolean kontrol = false;

        while (!kontrol) {
            System.out.print("n1 sayısını girin: ");
            n1 = scanner.nextInt();
            System.out.print("n2 sayısını girin: ");
            n2 = scanner.nextInt();
            if (n1 < 1 || n2 < 1) {
                System.out.println("Girilen sayı 1'den büyük olmalı. ");
            }
            else
                kontrol=true;
        }

        // küçük olanı bulma
        int min = n1;
        if (min > n2)
            min = n2;

        int i = 1;
        int ebob = 1;
        while (i <= min) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("ebob: " + ebob);

        i = 1;
        int ekok = 1;
        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("ekok: " + ekok);
    }
}
