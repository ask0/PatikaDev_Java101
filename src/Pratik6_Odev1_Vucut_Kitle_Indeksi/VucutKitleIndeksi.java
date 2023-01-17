package Pratik6_Odev1_Vucut_Kitle_Indeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy, kilo;
        System.out.print("Lütfen boyunuzu (METRE CİNSİNDEN) giriniz: ");
        boy = scanner.nextDouble();
        System.out.println("\nLütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();
        double indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + indeks);
    }
}
