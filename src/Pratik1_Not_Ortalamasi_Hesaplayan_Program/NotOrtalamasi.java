package Pratik1_Not_Ortalamasi_Hesaplayan_Program;

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        double mat, fiz, kim, tr, tar, muz;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat = scanner.nextDouble();
        System.out.println("Fizik notunuz: ");
        fiz = scanner.nextDouble();
        System.out.println("Kimya notunuz: ");
        kim = scanner.nextDouble();
        System.out.println("Türkçe notunuz: ");
        tr = scanner.nextDouble();
        System.out.println("Tarih notunuz: ");
        tar = scanner.nextDouble();
        System.out.println("Müzik notunuz:  ");
        muz = scanner.nextDouble();

        double ort = (mat + fiz + kim + tr + tar + muz)/6;
        System.out.println("Not ortalamanız: " + ort);

        String output = ort>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(output);
    }
}
