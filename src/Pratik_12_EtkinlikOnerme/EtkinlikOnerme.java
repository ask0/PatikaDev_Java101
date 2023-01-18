package Pratik_12_EtkinlikOnerme;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklığı girin: ");
        heat = scanner.nextInt();
        if(heat < 5)
            System.out.println("Kayak yapabilirsin. ");
        if(heat >= 5 && heat <= 15)
            System.out.println("Sinemaya gidebilirsin. ");
        if(heat >= 10 && heat <= 25)
            System.out.println("Pikniğe gidebilirsin. ");
        if(heat > 25)
            System.out.println("YÜzmeye gidebilirsin. ");

    }
}
