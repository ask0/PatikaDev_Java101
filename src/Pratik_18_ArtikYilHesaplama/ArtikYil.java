package Pratik_18_ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.print("Yıl girin: ");
        yil = scanner.nextInt();
        boolean kontrol = false;
        if(yil%4==0){
            kontrol = true;
            if(yil % 100 == 0 && yil % 400 != 0){
                kontrol = false;
            }
        }
        if(kontrol){
            System.out.println(yil + " bir artık yıldır.");
        }
        else
            System.out.println(yil + " bir artık yıl değildir.");
    }
}
