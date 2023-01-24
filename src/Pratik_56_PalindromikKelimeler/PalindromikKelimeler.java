package Pratik_56_PalindromikKelimeler;

import java.util.Scanner;

public class PalindromikKelimeler {
    static boolean isPalindromic(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        return temp.equals(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String word = scanner.next();
        boolean result = isPalindromic(word);
        if (result)
            System.out.println("Kelime palindromiktir.");
        else System.out.println("Kelime palindromik değildir.");
    }
}
