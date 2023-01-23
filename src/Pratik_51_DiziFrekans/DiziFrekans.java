package Pratik_51_DiziFrekans;

import java.util.Arrays;


public class DiziFrekans {
    public static void main(String[] args) {
        int[] dizi = {-5, 10, 20, 20, 0, 10, 10, 20, 5, 20, 6, 7, -5, 7, 33, 66, 99, 0, 77, 33, 33, 66, 11, 99, 99};
        int[] frekans = new int[dizi.length];
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println();
        int jump;
        int count = 0;
        for (int i = 0; i < dizi.length; i++) {
            int repeat = 1;
            jump = 0;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    repeat++;
                    jump++;
                } else break;
            }
            if (repeat > 0)
                frekans[count++] = repeat;
            i += jump;
        }
        // -->

        count = -1;
        for (int i = 0; i < dizi.length; i++) {
            if (i + 1 < dizi.length) {
                if ((dizi[i] != dizi[i + 1])) {
                    System.out.println(dizi[i] + " sayısı " + frekans[++count] + " kere tekrar etmiştir.");
                }
            } else System.out.println(dizi[i] + " sayısı " + frekans[++count] + " kere tekrar etmiştir.");

        }
        // Remove 0 values from the array
        int[] newFrequency = Arrays.copyOfRange(frekans, 0, count + 1);
        System.out.println(Arrays.toString(newFrequency));

        /* Another way
        int[] list = {100, 120, 70, 100, 10, 230, 85, 120, 100, 10, 10, -1};
        int count;
        System.out.println("List: " + Arrays.toString(list));
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j])
                    count++;
            }
            if (i == 0) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i != 0 && list[i] != list[i - 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
        }
        */
    }
}
