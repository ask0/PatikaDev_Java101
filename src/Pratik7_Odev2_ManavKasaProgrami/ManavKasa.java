package Pratik7_Odev2_ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut=2.14, elma=3.67, domates=1.1, muz=0.95, patlican=5;
        double toplam = 0;
        System.out.print("Armut kaç kilo?: ");
        toplam += armut * scanner.nextDouble();
        System.out.print("\nElma kaç kilo?: ");
        toplam += elma * scanner.nextDouble();
        System.out.print("\nDomates kaç kilo?: ");
        toplam += domates * scanner.nextDouble();
        System.out.print("\nMuz kaç kilo?: ");
        toplam += muz * scanner.nextDouble();
        System.out.print("\nPatlıcan kaç kilo?: ");
        toplam += patlican * scanner.nextDouble();
        System.out.print("\nToplam tutar: " + toplam + " TL");
    }
}
