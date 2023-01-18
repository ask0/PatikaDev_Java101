package Pratik_14_Burclar;

import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month;
        System.out.println("Doğduğunuz ay(sayıyla): ");
        month = scanner.nextInt();
        System.out.println("Doğduğunuz gün(sayıyla): ");
        day = scanner.nextInt();
        String burc = null;
        boolean flag = true;

        if((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 21))
            burc = "Oğlak";
        else if((month == 1 && day >= 22 && day <= 31) || (month == 2 && day >= 1 && day <= 19))
            burc = "Kova";
        else if((month == 2 && day >= 20 && day <= 31) || (month == 3 && day >= 1 && day <= 20))
            burc = "Balık";
        else if((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 20))
            burc = "Koç";
        else if((month == 4 && day >= 21 && day <= 31) || (month == 5 && day >= 1 && day <=21))
            burc = "Boğa";
        else if((month == 5 && day >= 22 && day <= 31) || (month == 6 && day >= 1 && day <= 22))
            burc = "İkizler";
        else if((month == 6 && day >= 23 && day <= 31) || (month == 7 && day >= 1 && day <= 22))
            burc = "Yengeç";
        else if((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22))
            burc = "Aslan";
        else if((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22))
            burc = "Başak";
        else if((month == 9 && day >= 23 && day <= 31) || (month == 10 && day >= 1 && day <= 22))
            burc = "Terazi";
        else if((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            burc = "Akrep";
        else if((month == 11 && day >= 22 && day <= 31) || (month == 12 && day >= 1 && day <= 21))
            burc = "Yay";
        else{
            flag = false;
            System.out.println("Hatalı giriş. Tekrar deneyin. ");
        }
        if(flag){
            System.out.println("Burcunuz: " + burc);
        }


    }
}
