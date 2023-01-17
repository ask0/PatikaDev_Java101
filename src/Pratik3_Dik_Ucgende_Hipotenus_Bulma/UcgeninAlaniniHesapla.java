package Pratik3_Dik_Ucgende_Hipotenus_Bulma;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UcgeninAlaniniHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,z;
        System.out.println("Üçgenin kenar uzunluklarını giriniz : ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        double u = (x+y+z)/2;
        double cevre = 2*u;
        double alan = sqrt(u*(u-x)*(u-y)*(u-z));
        System.out.println("Çevresi: " + cevre + "\nAlanı: " + alan);
    }
}
