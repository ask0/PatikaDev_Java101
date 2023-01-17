package Pratik5_Dairenin_Alani_ve_Cevresini_Hesaplama;

import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yarıçap ile alanı bulma
        double r; // yarıçap
        System.out.println("Dairenin yarıçapını girin: ");
        r = scanner.nextDouble();
        double alan = Math.PI * r * r; // alan
        double cevre = 2 * Math.PI * r; // çevre
        System.out.println("Dairenin alanı: " + alan + "\nDairenin çevresi: " + cevre);

        // Daire diliminin alanını bulma
        System.out.println("Merkez açısının ölçüsünü girin(\uD835\uDEFC): ");
        double a = scanner.nextDouble(); // açının ölçüsü
        System.out.println("Dairenin yarıçapını girin: ");
        r = scanner.nextDouble();
        alan =  (3.14 * (r * r) * a) / 360;
        System.out.println("Dairenin alanı: " + alan);

        /*
        boolean flag = true;
        while(flag){
            System.out.println("Seçiminizi yapın..");
            System.out.println("1- Dairenin alanını ve çevresini hesapla");
            System.out.println("2- Daire diliminin alanını hesapla");
            System.out.println("3- İşlemi sonlandır");
            int secim;
            secim = scanner.nextInt();
            double r; // yarıçap
            double alan; // alan
            double cevre; // çevre
            double a; // açı
            switch (secim){
                case 1:
                    // Yarıçap ile alanı bulma
                    System.out.println("Dairenin yarıçapını girin: ");
                    r = scanner.nextDouble();
                    alan = Math.PI * r * r; // alan
                    cevre = 2 * Math.PI * r; // çevre
                    System.out.println("Dairenin alanı: " + alan + "\nDairenin çevresi: " + cevre);
                    break;
                case 2:
                    // Daire diliminin alanını bulma
                    System.out.println("Merkez açısının ölçüsünü girin(\uD835\uDEFC): ");
                    a = scanner.nextDouble(); // açının ölçüsü
                    System.out.println("Dairenin yarıçapını girin: ");
                    r = scanner.nextDouble();
                    alan =  (3.14 * (r * r) * a) / 360;
                    System.out.println("Dairenin alanı: " + alan);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Yanlış seçim. Tekrar deneyin. ");
                    break;
            }
        }
        */
    }
}
