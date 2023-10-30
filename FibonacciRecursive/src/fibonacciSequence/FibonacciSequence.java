/*-----------------------------------------------------------------------------------------------
Parametresi ile aldığı n sayısı için n-inci Fibonacci sayısını döndüren getFibonacciNumber isimli
metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz

Açıklamalar:
- Fibonacci sayıları
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 ...
- Metot pozitif olmayan n değerleri için kontrol yapmayacaktır
-----------------------------------------------------------------------------------------------*/
package fibonacciSequence;

import java.util.Scanner;

public class FibonacciSequence {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        for (; ; ) {
            System.out.print("Bir sayı giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            System.out.printf("%d. Fibonacci sayısı %d%n", n, getFibonacciNumber(n));
        }
        System.out.println("Döngü sonu");
    }

    public static int getFibonacciNumber(int n)
    {
        if (n <= 2)
            return n - 1;

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);


    }
}

