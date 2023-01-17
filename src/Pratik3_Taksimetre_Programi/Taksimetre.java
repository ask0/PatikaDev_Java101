package Pratik3_Taksimetre_Programi;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam, acilis=10, gidilecekKm, kmBasi=2.20;
        System.out.println("Kaç km yol gidilecek?: ");
        gidilecekKm = scanner.nextDouble();
        toplam = acilis + gidilecekKm*kmBasi;
        toplam = (toplam<20) ? 20 : toplam;
        System.out.println(toplam);
    }
}
