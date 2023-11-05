package Prime;
import java.util.Scanner;

public class PrimeRecursive {

    public static boolean isPrime(long val, int i)
    {
        if (i == 1)
            return true;
        else if (val % i == 0)
            return false;
        else
            return isPrime(val, i - 1);
    }
}
