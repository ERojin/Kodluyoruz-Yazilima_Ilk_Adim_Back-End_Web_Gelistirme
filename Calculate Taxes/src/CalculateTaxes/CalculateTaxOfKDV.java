package CalculateTaxes;

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
