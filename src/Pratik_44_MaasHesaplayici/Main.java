package Pratik_44_MaasHesaplayici;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void maasHesapla() {
        String ad;
        double maas;
        int saat;
        int yil;
        System.out.println("########################");
        System.out.println("Eleman adı: ");
        ad = scanner.nextLine();
        System.out.println("Eleman maaşı: ");
        maas = scanner.nextDouble();
        System.out.println("Çalışma saati: ");
        saat = scanner.nextInt();
        System.out.println("İşe girme yılı:(<2021)");
        yil = scanner.nextInt();
        Employee eleman = new Employee(ad, maas, saat, yil);
        eleman.toString();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Mark", 2000, 45, 1985);
        e1.toString();

        maasHesapla();
    }
}
