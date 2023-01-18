package Pratik_17_CinZodyagi;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.print("Doğum yılınız: ");
        yil = scanner.nextInt();
        String zodiac = "";
        boolean isError = false;
        switch (yil%12){
            case 0 -> zodiac = "Maymun";
            case 1 -> zodiac = "Horoz";
            case 2 -> zodiac = "Köpek";
            case 3 -> zodiac = "Domuz";
            case 4 -> zodiac = "Fare";
            case 5 -> zodiac = "Öküz";
            case 6 -> zodiac = "Kaplan";
            case 7 -> zodiac = "Tavşan";
            case 8 -> zodiac = "Ejderha";
            case 9 -> zodiac = "Yılan";
            case 10 -> zodiac = "At";
            case 11 -> zodiac = "Koyun";
            default -> isError = true;
        }
        if(isError){
            System.out.println("Hatalı giriş. Yıl 0'dan büyük olmalı.");
        }
        else {
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        }
    }
}
