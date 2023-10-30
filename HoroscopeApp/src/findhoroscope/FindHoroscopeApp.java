/*-------------------------------------------------------------------------------------------------------
Java koşullu ifadeler ile kullanıcının burcunu bulan program yazınız.

Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 --------------------------------------------------------------------------------------------------------*/
package findhoroscope;

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
