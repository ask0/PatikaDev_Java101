package Pratik_27_Atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user, pw;
        int hak = 3;
        while (hak > 0) {
            System.out.print("Kullanıcı adı girin: ");
            user = scanner.nextLine();
            System.out.print("Şifre girin: ");
            pw = scanner.nextLine();
            int miktar, toplam = 0, secim = 0;
            if (user.equals("admin") && pw.equals("123456")) {
                System.out.println("Başarıyla giriş yapıldı.");
                while (secim != 4) {
                    System.out.println("Yapmak istediğiniz işlemi seçin.\n1- Para yatır\n2- Para çek\n3- Bakiye görüntüle\n4- Çıkış");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1 -> {
                            System.out.println("Yatırmak istediğiniz para miktarı: ");
                            miktar = scanner.nextInt();
                            toplam += miktar;
                        }
                        case 2 -> {
                            System.out.println("Çekmek istediğiniz para miktarı: ");
                            miktar = scanner.nextInt();
                            if (miktar > toplam) {
                                System.out.println("Yetersiz bakiye.");
                            } else {
                                toplam -= miktar;
                            }
                        }
                        case 3 -> System.out.println("Toplam bakiyeniz: " + toplam);

                        case 4 -> {
                            System.out.println("Çıkış başarıyla yapıldı.");
                            hak = 0;
                        }
                        default -> System.out.println("Yanlış seçim yaptınız. Tekrar deneyin");
                    }
                }
            } else {
                hak--;
                if (hak == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.");
                    break;
                } else {
                    System.out.println("Kullanıcı adı veya şifre hatalı. " + hak + " giriş hakkınız kaldı.");
                }
            }
        }
    }
}
