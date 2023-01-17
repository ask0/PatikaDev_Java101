package Pratik10_KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id, pwd;
        System.out.print("Kullanıcı adı: ");
        id = scanner.nextLine();
        System.out.print("\nŞifre: ");
        pwd = scanner.nextLine();
        if(!(id.equals("admin") && pwd.equals("123456"))){
            String secim="";
            boolean flag1 = true;
            while(flag1){
                System.out.println("Hatalı giriş. Şifrenizi sıfırlamak istiyor musunuz? (Y/N)");
                secim = scanner.nextLine();
                if(secim.equals("Y") || secim.equals("N"))
                    flag1 = false;
            }
            switch (secim) {
                case "Y" -> {
                    System.out.println("Yeni şifreniz önceki şifrenizden farklı olmalıdır.");
                    System.out.print("\nYeni şifreyi girin: ");
                    boolean flag = true;
                    while (flag) {
                        pwd = scanner.nextLine();
                        if (pwd.equals("123456")) {
                            System.out.print("\nŞifre oluşturulamadı, lütfen başka şifre giriniz: ");
                        } else {
                            flag = false;
                            System.out.print("\nŞifre oluştruldu.");
                        }
                    }
                }
                case "N" -> System.out.print("\nÇıkış yapıldı");
                default -> System.out.print("\nHatalı giriş yaptınız. Tekrar deneyin (Y/N)");
            }
        }
        else
            System.out.println("Giriş başarılı");
    }
}
