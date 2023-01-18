package Pratik_21_TwoPower;

import java.util.Scanner;

public class TwoPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("4'ün kuvvetleri:");
        System.out.print("Sayı girin: ");
        x = scanner.nextInt();
        for(int i = 1; i <= x; i *= 4){
            System.out.print(i + " ");
        }
        System.out.println("\n5'in kuvvetleri:");
        System.out.println("Sayı girin: ");
        x = scanner.nextInt();

        for(int i = 1; i <= x; i *= 5){
            System.out.print(i + " ");
        }
    }
}
