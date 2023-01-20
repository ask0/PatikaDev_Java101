package Pratik_37_RecursiveFibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibo(int x) {
        if (x == 1 || x == 2)
            return 1;
        return fibo(x - 1) + fibo(x - 2);
    }
    public static void main(String[] args) {
        System.out.print("Fibonacci sayısının sırası: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        System.out.println(sayi + ". fibonacci sayısı: " + fibo(sayi));
        System.out.print("İlk " + sayi + " fibonacci sayısı: ");
        for (int i = 1; i <= sayi; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
