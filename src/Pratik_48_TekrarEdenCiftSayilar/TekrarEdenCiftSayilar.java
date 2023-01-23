package Pratik_48_TekrarEdenCiftSayilar;

import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {-8, 14, 1, 2, 0, 3, 4, 12, 12, 2, -4, 5, -10, -4, -5, -8, 1, 11, 0, 17, 6, 6, 12, -8, 12, 14, 0};
        int count = 0;
        int[] cift = new int[dizi.length];
        boolean isZero = true;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && dizi[i] % 2 == 0) {
                    boolean kontrol = true;
                    for (int k = 0; k < dizi.length; k++) {
                        if (dizi[i] == 0 && dizi[i] == cift[k] && isZero) {  // multiple 0 control
                            isZero = false;
                            cift[count++] = dizi[i];
                        }
                        if (dizi[i] == cift[k])
                            kontrol = false;
                    }
                    if (kontrol)
                        cift[count++] = dizi[i];
                }
            }
        }
        System.out.println("#################################################");
        int[] copyCift = new int[count];
        for (int i = 0; i < count; i++) {
            copyCift[i] = cift[i];
        }
        System.out.print("Tekrar eden çift sayılar: ");
        for (int i : copyCift) {
            if (i == cift[0])
                System.out.print("[");
            System.out.print(i);
            if (i == cift[count - 1])
                System.out.printf("]");
            else
                System.out.print(", ");
        }
        System.out.println("\n#################################################");
        // removing the extra empty inputs in cift[]
        int[] cift2 = Arrays.copyOfRange(cift, 0, count);
        System.out.println("Tekrar eden çift sayılar: " + Arrays.toString(cift2));
    }
}
