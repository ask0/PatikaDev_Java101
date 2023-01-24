package Pratik_55_SayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSayi = random.nextInt(100);
        int hak = 0;
        int maxHak = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println(randomSayi);
        boolean isTrue = false;
        boolean isFalse = false;
        boolean noInput = false;
        int[] tahminler = new int[maxHak];
        while (hak < 5) {
            System.out.print("0-100 arası bir sayı girin :");
            int tahmin = scanner.nextInt();
            if (tahmin < 0 || tahmin > 100) {
                if (isFalse) {
                    System.out.println("Hatalı giriş yaptınız. Kalan hak: " + (maxHak - hak - 1));
                    hak++;
                    if (hak == maxHak)
                        noInput = true;
                } else if (hak == 0) {
                    isFalse = true;
                    System.out.println("Hatalı giriş yaptınız. Bir sonraki hatalı girişinizde kalan hakkınızdan düşecektir.");
                }
                continue;
            }

            if (randomSayi == tahmin) {
                System.out.println("Doğru tahmin ettiniz. Sayı: " + randomSayi);
                isTrue = true;
                break;
            } else if (randomSayi > tahmin) {
                System.out.println("Hatalı tahmin. Sayı, tahminininden büyüktür.");
            } else {
                System.out.println("Hatalı tahmin. Sayı, tahmininizden küçüktür.");
            }

            tahminler[hak++] = tahmin;
            System.out.println("Kalan hak: " + (maxHak - hak));
        }

        if (!isTrue) {
            System.out.println("Kaybettiniz.");
            if (!noInput) {
                System.out.println("Kaybettiniz. Tahminleriniz:" + Arrays.toString(tahminler));
                System.out.println("Sayı: " + randomSayi);
            }
        }


    }
}
