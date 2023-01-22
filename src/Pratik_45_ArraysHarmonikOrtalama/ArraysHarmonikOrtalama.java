package Pratik_45_ArraysHarmonikOrtalama;

import java.util.Arrays;

public class ArraysHarmonikOrtalama {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double[] harmonic = new double[numbers.length];

        double harmonicSeries;

        for (int i = 0; i < numbers.length; i++) {
            for (double j = 0; j < numbers[i]; j++) {
                harmonic[i] += 1 / (j + 1);
            }

        }
        harmonicSeries = harmonic[numbers.length - 1];
        System.out.println(Arrays.toString(harmonic));
        System.out.println("Harmonic Seri: " + harmonicSeries);
        System.out.println("Harmonic Ort: " + numbers.length / harmonicSeries);
    }
}
