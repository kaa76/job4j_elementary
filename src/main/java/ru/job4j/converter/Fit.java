package ru.job4j.converter;

/**
 * Класс для расчёта идеального веса по росту для мужчин и женщин.
 */
public class Fit {

    private static final double MAN_COEFFICIENT = 1.15;
    private static final double WOMAN_COEFFICIENT = 1.15;

    /**
     * Рассчитывает идеальный вес мужчины по формуле (рост - 100) * коэффициент.
     * @param height рост в сантиметрах, должен быть положительным.
     * @return идеальный вес в килограммах.
     */
    public static double manWeight(int height) {
        validateHeight(height);
        return (height - 100) * MAN_COEFFICIENT;
    }

    /**
     * Рассчитывает идеальный вес женщины по формуле (рост - 110) * коэффициент.
     * @param height рост в сантиметрах, должен быть положительным.
     * @return идеальный вес в килограммах.
     */
    public static double womanWeight(int height) {
        validateHeight(height);
        return (height - 110) * WOMAN_COEFFICIENT;
    }

    private static void validateHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным числом");
        }
    }

    public static void main(String[] args) {
        int height = 184;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.printf("Man with height %d cm has ideal weight %.2f kg%n", height, man);
        System.out.printf("Woman with height %d cm has ideal weight %.2f kg%n", height, woman);
    }
}
