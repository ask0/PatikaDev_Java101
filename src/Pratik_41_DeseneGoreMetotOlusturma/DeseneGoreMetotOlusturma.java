package Pratik_41_DeseneGoreMetotOlusturma;

import java.util.Scanner;
public class DeseneGoreMetotOlusturma {
    static void desen (int x) {
        System.out.print(x + " ");
        if(x<=0)
            return ;
        desen(x - 5);
        System.out.print(x + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scanner.nextInt();
        desen(n);
    }
}
