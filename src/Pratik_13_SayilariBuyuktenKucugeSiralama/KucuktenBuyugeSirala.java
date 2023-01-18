package Pratik_13_SayilariBuyuktenKucugeSiralama;

import java.util.Scanner;

public class KucuktenBuyugeSirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("1. sayı: ");
        x = scanner.nextInt();
        System.out.println("2. sayı: ");
        y = scanner.nextInt();
        System.out.println("3. sayı: ");
        z = scanner.nextInt();

        if((x < y) && (x < z)){
            if(y < z)
                System.out.println(x + "<" + y + "<" + z);
            else
                System.out.println(x + "<" + z + "<" + y);
        }
        else if((y < x) && (y < z)){
            if(x < z)
                System.out.println(y + "<" + x + "<" + z);
            else
                System.out.println(y + "<" + z + "<" + x);
        }
        else{
            if(x < y)
                System.out.println(z + "<" + x + "<" + y);
            else
                System.out.println(z + "<" + y + "<" + x);
        }

    }
}
