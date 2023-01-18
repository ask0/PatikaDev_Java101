package Pratik_19_CiftSayiToplam;

import java.util.Scanner;

public class CiftSayiToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, top = 0, adet = 0, ort;
        System.out.print("Bir sayı girin: ");
        sayi = scanner.nextInt();
        for(int i = 1; i <= sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                adet++;
                top += i;
            }
        }
        ort = top / adet;
        System.out.println("3 ve 4'e tam bölünebilen sayıların ortalaması: " + ort);

    }
}
