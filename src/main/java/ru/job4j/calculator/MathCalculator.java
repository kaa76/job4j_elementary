package ru.job4j.calculator;
//import ru.job4j.math.MathFunction;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
//        return MathFunction.sum(first, second)
//                + MathFunction.multiply(first, second);
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfDiffAndDiv(double first, double second) {
        return sum(diff(first, second), div(first, second));
    }

    public static double sumComplete(double first, double second) {
        return sum(diff(first, second), div(first, second)) + sumAndMultiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfDiffAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumComplete(10, 20));
    }
}
