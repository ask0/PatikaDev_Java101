package Pratik_16_UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km, yas, type;
        double perKm = 0.10;
        double toplam = 0;
        boolean isError = false;
            System.out.print("Mesafeyi km türünden girin: ");
            km = scanner.nextInt();
            toplam += km * perKm;
            if(km <= 0){
                System.out.println("Mesafe 0'dan büyük olmalı.");
                isError = true;
            }

            System.out.print("Yaşınızı girin: ");
            yas = scanner.nextInt();
            if(yas <= 0){
                System.out.println("Yaş 0'dan büyük olmalı.");
                isError = true;
            }
            else if(yas < 12){
                toplam *= 0.5;
            }
            else if(yas <= 24){
                toplam *= 0.9;
            }
            else if(yas > 65){
                toplam *= 0.7;
            }

            System.out.print("Yolculuk tipini girin (1 => Tek Yön, 2 => Gidiş Dönüş):");
            type = scanner.nextInt();
            if(!(type == 1 || type == 2)){
                System.out.println("Tür 1 ya da 2 olmalı.");
                isError = true;
            }

            if(type == 2){
                toplam *= 0.8;
            }

            if(isError){
                System.out.println("Hatalı veri girdiniz. ");
            }
            else {
                System.out.println("Toplam tutar: " + toplam);
            }

    }
}
