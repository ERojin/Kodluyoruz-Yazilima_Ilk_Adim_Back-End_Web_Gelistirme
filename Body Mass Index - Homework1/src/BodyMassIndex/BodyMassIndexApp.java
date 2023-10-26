/*-------------------------------------------------------------------------------------------------------
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 --------------------------------------------------------------------------------------------------------*/
package BodyMassIndex;
import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        BodyMassIndexApp.run();
    }
}
class BodyMassIndexApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        double length = kb.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        double weight = kb.nextDouble();

        System.out.printf("Vücut Kitle İndeksiniz : %f%n", bodyMassIndexCalculate(length,weight));
    }
   public static double bodyMassIndexCalculate(double length, double weight)
   {
       double bodymassindex = weight / (length * length);
       return bodymassindex ;
   }
}
