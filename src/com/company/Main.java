package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Kullanıcıdan kullanıcı adı ve şifre isteyip herhangi birinde hata olması durumunda-
        şifreyi sıfırlamayı isteyip istememeyi soran ve yeni şifrenin, eski şifreyle aynı olmamasını-
        sorgulayan program.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        String kullanici = input.next();
        System.out.println("Şifrenizi giriniz: ");
        String sifre = input.next();
        // Aşağıda geçerli kullanici adı ve şifreyi "patika" ve "patika123 olarak belirledim."
        if (kullanici.equals("patika") && sifre.equals("patika123")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Şifre veya kullanıcı adı hatalı.\n Şifreyi sıfırlamak ister misiniz?\n Evet ise 1'e Hayır ise 2'ye basınız");
            int karar = input.nextInt();
            String yeniSifre;
            int degisken = 0;

            if (karar == 1) {

                while (degisken == 0) {

                    System.out.println("Yeni şifreyi giriniz: ");
                    yeniSifre = input.next();
                    if (yeniSifre.equals("patika123")) {
                        degisken = 0;
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        degisken = 1;
                        System.out.println("Şifre " + "\"" + yeniSifre + "\"" + " olarak değiştirildi.");
                    }


                }
            } else if (karar == 2) {
                System.out.println("Tamam, şifre sıfırlanmadı");
            } else System.out.println("Yanlış tercih yaptınız");

        }
    }
}
