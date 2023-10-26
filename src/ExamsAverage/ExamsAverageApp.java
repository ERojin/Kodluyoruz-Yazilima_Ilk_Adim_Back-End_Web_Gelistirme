package ExamsAverage;

import java.util.Scanner;

public class ExamsAverageApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Matematik sınavı sonucunu giriniz:");
        int math = kb.nextInt();
        System.out.print("Fizik sınavı sonucunu giriniz:");
        int physics = kb.nextInt();
        System.out.print("Kimya sınavı sonucunu giriniz:");
        int chemistry = kb.nextInt();
        System.out.print("Türkçe sınavı sonucunu giriniz:");
        int turkish = kb.nextInt();
        System.out.print("Tarih sınavı sonucunu giriniz:");
        int history = kb.nextInt();
        System.out.print("Müzik sınavı sonucunu giriniz:");
        int music = kb.nextInt();

        int sum = math + physics + chemistry + turkish + history + music;

        System.out.println(ExamsAverage.result(sum));

    }

}
