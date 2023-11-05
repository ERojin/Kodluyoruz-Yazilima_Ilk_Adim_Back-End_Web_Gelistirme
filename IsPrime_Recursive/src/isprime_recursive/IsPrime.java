package isprime_recursive;

import java.util.Scanner;

public class IsPrime {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Bir sayı giriniz:");
            int n = kb.nextInt();

            if (n <= 1)
                break;

            if (isPrime(n))
                System.out.print("%d sayısı asaldır");
            else
                System.out.print("%d sayısı asal değildir");
        }
    }

    public static boolean isPrime(long n)
    {

    }
}
