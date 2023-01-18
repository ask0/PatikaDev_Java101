package Pratik_20_TekSayiToplam;

import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, toplam = 0;
        while(true){
            System.out.print("Bir sayı giriniz: ");
            input = scanner.nextInt();
            if(input <= 0){
                System.out.println("Sıfırdan büyük bir sayı girin.. ");
                continue;
            }
            if(input % 2 == 1){
                break;
            }
            else if(input % 4 == 0){
                toplam += input;
            }
        }
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
