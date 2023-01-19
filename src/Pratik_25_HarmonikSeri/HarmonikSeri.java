package Pratik_25_HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam = 0, n;
        System.out.print("n girin: ");
        n = scanner.nextInt();
        for(double i=1; i<=n; i++){
            toplam += 1/i;
        }
        System.out.println("Harmonik seri toplamı: " + toplam);
    }
}
