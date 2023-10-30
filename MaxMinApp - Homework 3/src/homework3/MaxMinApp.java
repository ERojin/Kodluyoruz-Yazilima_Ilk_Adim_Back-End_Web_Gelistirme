/*----------------------------------------------------------------------------------------------------------------------
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları
ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
----------------------------------------------------------------------------------------------------------------------*/
package homework3;
import java.util.Scanner;

public class MaxMinApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = kb.nextInt();

        for (int i = 1; i <= n ; ++i) {
            System.out.printf("%d. sayıyı giriniz: ", i);
            num = kb.nextInt();

        if (num > max)
            max = num;
        if (num < min)
            min = num;
        }

        System.out.printf("En büyük sayı: %d \nEn küçük sayı: %d%n", max, min);
    }
}
