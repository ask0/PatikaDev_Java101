package Pratik2_Kdv_Hesaplama;

import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kdvsiz, kdvli, kdvTutar;
        System.out.println("Bir fiyat girin: ");
        kdvsiz = scanner.nextDouble();

        double kdv = (kdvsiz>=0 && kdvsiz<=1000) ? 18 : 8;
        kdvli = kdvsiz*(100+kdv)/100;
        kdvTutar = kdvli-kdvsiz;

        System.out.println("KDV'siz fiyat= " + kdvsiz);
        System.out.println("KDV'li fiyat= " + kdvli);
        System.out.println("KDV tutarı= " + kdvTutar);



    }
}
