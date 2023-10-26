package ExamsAverage;

public class ExamsAverage {
    public static String result(int sum)
    {
        double average = examsAverage(sum);
        return average > 60 ? "Sınıfı geçti" : "Kaldı";

    }
    public static double examsAverage(int sum)
    {
        double average = sum / 6;
        return average;
    }
}
