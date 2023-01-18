package Pratik_11_SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mat, fiz, tur, kim, muz;
        double gecmeNotu = 55;
        double ort;
        boolean flag = true;
        while(flag){

            System.out.print("Matematik notunu girin: ");
            mat = scanner.nextDouble();
            if(mat < 0 || mat > 100){
                System.out.println("Girilen not 0-100 aralığında olmalıdır.");
                break;
            }
            System.out.print("Fizik notunu girin: ");
            fiz = scanner.nextDouble();
            if(fiz < 0 || fiz > 100){
                System.out.println("Girilen not 0-100 aralığında olmalıdır.");
                break;
            }
            System.out.print("TÜrkçe notunu girin: ");
            tur = scanner.nextDouble();
            if(tur < 0 || tur > 100){
                System.out.println("Girilen not 0-100 aralığında olmalıdır.");
                break;
            }
            System.out.print("Kimya notunu girin: ");
            kim = scanner.nextDouble();
            if(kim < 0 || kim > 100){
                System.out.println("Girilen not 0-100 aralığında olmalıdır.");
                break;
            }
            System.out.print("Müzik notunu girin: ");
            muz = scanner.nextDouble();
            if(muz < 0 || muz > 100){
                System.out.println("Girilen not 0-100 aralığında olmalıdır.");
                break;
            }
            ort = (mat + fiz + tur + kim + muz) / 5;
            if(ort >= gecmeNotu && ort<=100){
                System.out.print("Ortalaman: " + ort);
                System.out.print("\nSınıfı geçtin.");
                flag = false;
            }
            else if(ort >= 0 && ort <gecmeNotu){
                System.out.print("Ortalaman: " + ort);
                System.out.print("\nSınıfta kaldın");
                flag = false;
            }
            else
                System.out.println("Ortalama 0-100 aralığında olmalıdır. Notlarını tekrar gir. ");
        }

    }
}
