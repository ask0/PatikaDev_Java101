package Pratik_48_ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". elemanı girin: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] sorted = array;
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n###########################");
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}
