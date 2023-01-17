package Pratik3_Dik_Ucgende_Hipotenus_Bulma;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class HipotenusBul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        System.out.println("Üçgenin ilk kenarı: ");
        x = scanner.nextDouble();
        System.out.println("Üçgenin ikinci kenarı: ");
        y = scanner.nextDouble();
        double hipotenus = sqrt(x*x + y*y);
        System.out.println("Hipotenüs= " + hipotenus);

    }
}
