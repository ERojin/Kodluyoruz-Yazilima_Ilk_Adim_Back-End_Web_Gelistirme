/*-------------------------------------------------------------------------------------------------------
Koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program.

Alıştırma
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 --------------------------------------------------------------------------------------------------------*/
package FindHoroscope;

import java.util.Scanner;

public class FindHoroscopeApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz:");
        int month = kb.nextInt();
        System.out.print("Doğduğunuz günü giriniz:");
        int day = kb.nextInt();

        System.out.printf("Burcunuz: %s%n",findHoroscope(month,day));

    }

    public static boolean checkValues(int month, int day)
    {
        if (month == 2)
            return day > 0 && day < 29;

        return day > 0 && day < 32 && month > 0 && month < 13;
    }

    public static String findHoroscope(int month, int day)
    {
        String horoscope = "";

        if (checkValues(month, day)) {

            switch (month) {
                case 1:
                    horoscope = (day < 22) ? "Oğlak burcu" : "Kova burcu";
                    break;
                case 2:
                    horoscope = (day < 20) ? "Kova burcu" : "Balık burcu";
                    break;
                case 3:
                    horoscope = (day < 21) ? "Balık burcu" : "Koç burcu";
                    break;
                case 4:
                    horoscope = (day < 21) ? "Koç burcu" : "Boğa burcu";
                    break;
                case 5:
                    horoscope = (day < 22) ? "Boğa burcu" : "İkizler burcu";
                    break;
                case 6:
                    horoscope = (day < 23) ? "İkizler burcu" : "Yengeç burcu";
                    break;
                case 7:
                    horoscope = (day < 23) ? "Yengeç burcu" : "Aslan burcu";
                    break;
                case 8:
                    horoscope = (day < 23) ? "Aslan burcu" : "Başak burcu";
                    break;
                case 9:
                    horoscope = (day < 23) ? "Başak burcu" : "Terazi burcu";
                    break;
                case 10:
                    horoscope = (day < 23) ? "Terazi burcu" : "Akrep burcu";
                    break;
                case 11:
                    horoscope = (day < 22) ? "Akrep burcu" : "Yay burcu";
                    break;
                case 12:
                    horoscope = (day < 22) ? "Yay burcu" : "Oğlak burcu";
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz.");
            }
        }

        return horoscope;
    }


}
