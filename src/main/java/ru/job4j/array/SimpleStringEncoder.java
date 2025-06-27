package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                if (counter == 1) {
                    result = result + symbol;
                } else {
                    result = result + symbol + counter;
                }
                symbol = input.charAt(i);
                counter = 1;
            }
            if (i == input.length() - 1) {
                if (counter == 1) {
                    result = result + symbol;
                } else {
                    result = result + symbol + counter;
                }
            }
        }
        return result;
    }
}