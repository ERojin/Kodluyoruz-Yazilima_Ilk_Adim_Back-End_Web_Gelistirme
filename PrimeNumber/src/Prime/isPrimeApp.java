package Prime;

import java.util.Scanner;
import static Prime.PrimeRecursive.isPrime;
import static Prime.Prime.isPrime;

public class isPrimeApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        long val = Long.parseLong(kb.nextLine());

        if (isPrime(val))
            System.out.printf("%d bir asal sayıdır.%n",val);
        else
            System.out.printf("%d asal sayı değildir.%n",val);

    }
}
