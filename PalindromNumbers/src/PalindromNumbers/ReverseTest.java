package PalindromNumbers;

import java.util.Scanner;

import static PalindromNumbers.PalindromNumbersApp.reverseNumber;

public class ReverseTest {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = kb.nextInt();

        System.out.printf("Girdiğiniz sayının tersi %d%n", reverseNumber(n));
    }

}
