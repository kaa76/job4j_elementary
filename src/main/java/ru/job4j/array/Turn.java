package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int j = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[j - 1];
            array[j - 1] = tmp;
            j--;
        }
        return array;
    }
}