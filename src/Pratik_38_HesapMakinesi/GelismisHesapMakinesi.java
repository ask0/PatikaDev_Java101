package Pratik_38_HesapMakinesi;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static double topla(double a, double b) {
        return a + b;
    }

    static double cikar(double a, double b) {
        return a - b;
    }

    static double carp(double a, double b) {
        return a * b;
    }

    static double bol(double a, double b) {
        return a / b;
    }

    static double us(double taban, double us) {
        if (us != 0) {
            return (taban * us(taban, us - 1));
        } else
            return 1;
    }

    static double faktoriyel(double a) {
        if (a == 1)
            return 1;
        return a * faktoriyel(a - 1);
    }

    static double mod(double a, double b) {
        return a % b;
    }

    static double dikdortgenAlan(double a, double b) {
        return a * b;
    }

    static double dikdortgenCevre(double a, double b) {
        return 2 * (a + b);
    }

    static void secimEkrani() {
        System.out.println("1- Toplama İşlemi: ");
        System.out.println("2- Çıkarma İşlemi: ");
        System.out.println("3- Çarpma İşlemi");
        System.out.println("4- Bölme İşlemi: ");
        System.out.println("5- Üslü Sayı Hesaplama: ");
        System.out.println("6- Faktöriyel Hesaplama: ");
        System.out.println("7- Mod Alma: ");
        System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı: ");
        System.out.println("9- Çıkış Yap");
    }

    static Scanner scanner = new Scanner(System.in);

    static void HesapMakinesi() {
        int secim;
        double s1, s2, sonuc = 0;
        System.out.println("Hesap Makinesi..\nYapmak istediğiniz işlemi seçin: ");
        try {
            while (true) {
                secimEkrani();
                secim = scanner.nextInt();
                if (secim >= 1 && secim <= 9)
                    break;
                else
                    System.out.println("Hatalı giriş. Tekrar deneyin: ");
            }
            boolean isContinue = true;
            while (isContinue) {
                switch (secim) {
                    case 1 -> {
                        System.out.println("Toplama işlemini seçtiniz.");
                        System.out.print("1. sayıyı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("2. sayıyı girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = topla(s1, s2);
                        System.out.println("Sonuç: " + sonuc);
                    }
                    case 2 -> {
                        System.out.println("Çıkarma işlemini seçtiniz.");
                        System.out.print("1. sayıyı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("2. sayıyı girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = cikar(s1, s2);
                        System.out.println("Sonuç: " + sonuc);
                    }
                    case 3 -> {
                        System.out.println("Çarpma işlemini seçtiniz.");
                        System.out.print("1. sayıyı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("2. sayıyı girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = carp(s1, s2);
                        System.out.println("Sonuç: " + sonuc);
                    }
                    case 4 -> {
                        System.out.println("Bölme işlemini seçtiniz.");
                        System.out.print("1. sayıyı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("2. sayıyı girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = bol(s1, s2);
                        System.out.println("Sonuç: " + sonuc);
                    }
                    case 5 -> {
                        System.out.println("Üslü sayı alma işlemini seçtiniz. ");
                        System.out.print("Tabanı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("Üssü girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = us(s1, s2);
                        System.out.println("Sonuç: " + sonuc);
                    }

                    case 6 -> {
                        System.out.println("Faktöriyel alma işlemini seçtiniz. ");
                        System.out.print("Faktöriyelini bulmak istediğiniz sayı: ");
                        s1 = scanner.nextDouble();
                        sonuc = faktoriyel(s1);
                        System.out.println("Sonuç: " + sonuc);
                    }

                    case 7 -> {
                        System.out.println("Mod alma işlemini seçtiniz. ");
                        System.out.print("1. sayıyı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("2. sayıyı girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = mod(s1, s2);
                        System.out.println("Sonuç: " + sonuc);
                    }

                    case 8 -> {
                        System.out.println("Dikdörtgen Alan ve Çevre hesabını seçtiniz. ");
                        System.out.print("1. kenarı girin: ");
                        s1 = scanner.nextDouble();
                        System.out.print("2. kenarı girin: ");
                        s2 = scanner.nextDouble();
                        sonuc = dikdortgenAlan(s1, s2);
                        double sonuc2 = dikdortgenCevre(s1, s2);
                        System.out.println("Alanı: " + sonuc + ", Çevresi: " + sonuc2);
                    }
                    case 9 ->
                        isContinue = false;
                }

                while (isContinue) {
                    System.out.print("Devam etmek istiyor musunuz? (Y/N)");
                    String secim2 = scanner.next();
                    if (secim2.equals("Y")) {
                        isContinue = true;
                        break;
                    } else if (secim2.equals("N")) {
                        isContinue = false;
                        break;
                    } else {
                        System.out.print("Hatalı giriş. ");
                    }
                }
                if (!isContinue)
                    System.out.println("Çıkış yapıldı.");
                else {
                    while (true) {
                        secimEkrani();
                        secim = scanner.nextInt();
                        if (secim >= 1 && secim <= 9)
                            break;
                        else
                            System.out.println("Hatalı giriş. Tekrar deneyin: ");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }

    public static void main(String[] args) {
        HesapMakinesi();
    }
}
