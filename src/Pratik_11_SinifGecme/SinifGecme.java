package Pratik_11_SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mat, fiz, tur, kim, muz;
        double gecmeNotu = 55;
        double ort;
        System.out.print("Matematik notunu girin: ");
        mat = scanner.nextDouble();
        System.out.print("Fizik notunu girin: ");
        fiz = scanner.nextDouble();
        System.out.print("TÜrkçe notunu girin: ");
        tur = scanner.nextDouble();
        System.out.print("Kimya notunu girin: ");
        kim = scanner.nextDouble();
        System.out.print("Müzik notunu girin: ");
        muz = scanner.nextDouble();
        ort = (mat + fiz + tur + kim + muz) / 5;
        System.out.print("Ortalaman: " + ort);
        if(ort >= gecmeNotu)
            System.out.print("\nSınıfı geçtin.");
        else
            System.out.print("\nSınıfta kaldın");
    }
}
