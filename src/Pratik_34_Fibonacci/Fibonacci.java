package Pratik_34_Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = 0;
        try{
            while(true){
                System.out.print("Eleman sayısı: ");
                e = scanner.nextInt();
                if(e>1)
                    break;
                else
                    System.out.println("1'den büyük bir sayı girin.");
            }
            int a = 0, b = 1;
            int c;
            System.out.print(e + " elemanlı fibonacci serisi: " + a + " " + b + " ");
            for (int i = 0; i < e - 2; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }catch (Exception exception){
            System.out.println("Sayı girişi yapın.");
        }


    }
}
