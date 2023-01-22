package Pratik_46_ArraysMaxMin;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n girin: ");
        int n = scanner.nextInt();
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        int tempK;
        int kEnBuyuk = Integer.MIN_VALUE;
        int tempB;
        int bEnKucuk = Integer.MAX_VALUE;
        for (int j : dizi) {
            if (j < n) {
                tempK = j;
                if (tempK > kEnBuyuk)
                    kEnBuyuk = j;
            }
            if (j > n) {
                tempB = j;
                if (tempB < bEnKucuk)
                    bEnKucuk = j;
            }
        }
        System.out.println(n + "'den küçük en büyük: " + kEnBuyuk);
        System.out.println(n + "'den büyük en küçük: " + bEnKucuk);

        System.out.println("#####################");

        int[] sorted = Arrays.copyOf(dizi, dizi.length);
        Arrays.sort(sorted);
        int fark;
        int tmpB = sorted[sorted.length-1], tmpK = sorted[0];
        System.out.println(Arrays.toString(sorted));
        for (int j : sorted) {
            fark = n - j;
            if (fark > 0 && fark < n - tmpK) // küçük en büyük
                tmpK = j;
            if (fark < 0 && fark > n - tmpB)
                tmpB = j;
        }
        System.out.println(n + "'den küçük en büyük: " + tmpK);
        System.out.println(n + "'den büyük en küçük: " + tmpB);

    }
}
