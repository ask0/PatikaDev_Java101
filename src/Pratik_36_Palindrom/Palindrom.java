package Pratik_36_Palindrom;

import java.util.Scanner;

public class Palindrom {
    static Scanner scanner = new Scanner(System.in);
    static String palindrom(int x){
        if(x==0)
            return "";
        return x%10 + palindrom(x/10);
    }
    public static void palindromBul(){
        try{
            System.out.print("Sayı girin: ");
            int sayi = scanner.nextInt();
            while(true){
                if(sayi>0)
                    break;
                else{
                    System.out.print("Hatalı giriş yaptınız. 0'dan büyük bir sayı girin: ");
                    sayi = scanner.nextInt();
                }
            }
            String palindrom = palindrom(sayi);
            int palindromInt = Integer.parseInt(palindrom);
            if(palindromInt == sayi)
                System.out.println(sayi + " palindrom sayıdır.");
            else
                System.out.println(sayi + " palindrom bir sayı değildir.");
        } catch (Exception exception){
            System.out.println("Hatalı giriş");
        }
    }
    public static void main(String[] args) {
        palindromBul();
    }
}
