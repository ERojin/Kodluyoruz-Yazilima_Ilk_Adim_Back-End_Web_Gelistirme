/*---------------------------------------------------------------------------------------------------------------------
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yazınız.

Palindrom Sayı Nedir?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
---------------------------------------------------------------------------------------------------------------------*/
package palindromnumbers;
import java.util.Scanner;
public class PalindromNumbersApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number = kb.nextInt();

        if (isPalindrom(number))
            System.out.print("Girdiğiniz sayı palindromdur.");
        else
            System.out.print("Girdiğiniz sayı palindrom değildir.");
    }
    public static boolean isPalindrom(int number)
    {
        return number == reverseNumber(number) ;
    }
    public static int reverseNumber(int number)
    {
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }
}
