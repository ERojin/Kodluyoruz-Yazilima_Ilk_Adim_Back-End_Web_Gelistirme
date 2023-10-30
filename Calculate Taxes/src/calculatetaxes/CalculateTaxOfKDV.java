/*-------------------------------------------------------------------------------------------------------
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
programı yazın.
(Not : KDV tutarını 20% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 12;
KDV tutarı = 2.0;
Alıştırma
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %20 , tutar 1000 TL'den büyük ise KDV oranını %8
olarak KDV tutarı hesaplayan programı yazınız.
 --------------------------------------------------------------------------------------------------------*/
package calculatetaxes;

import java.util.Scanner;

public class CalculateTaxOfKDV {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz:");
        double price = kb.nextDouble();

        System.out.printf("Ürünün KDV'li fiyatı %.2f%n", calculateKDV(price));

    }
    public static double calculateKDV(double price)
    {
        double pricewithtax = price + (price * 0.2);
        return pricewithtax;
    }
}
