package Pratik9_HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        System.out.println("İlk sayıyı girin: ");
        n1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı girin: ");
        n2 = scanner.nextDouble();
        boolean flag = true;
        while(flag){
            System.out.println("İşlem seçin:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Çıkış");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1 -> System.out.println(n1 + n2);
                case 2 -> System.out.println(n1 - n2);
                case 3 -> System.out.println(n1 * n2);
                case 4 -> {
                    if (n2 != 0) {
                        System.out.println(n1 / n2);
                        break;
                    }
                    System.out.println("Bölen sıfır olamaz.");
                }
                case 5 -> flag = false;
                default -> System.out.println("Hatalı seçim. Tekrar deneyin. ");
            }
        }
    }
}
