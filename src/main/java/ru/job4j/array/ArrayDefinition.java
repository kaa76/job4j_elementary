package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Andrew Johnson";
        names[1] = "Donald McDuck";
        names[2] = "Alexander Cherkasov";
        names[3] = "Will Smith";
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
