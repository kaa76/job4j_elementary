package ru.job4j.array;

public class TwoNumberSum {
    public static int[] compress2Point(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] res = {};
        while (i < array.length) {
            if (array[i] + array[j] == target) {
                res = new int[]{i, j};
                i = array.length;
            } else {
                j++;
                if (j == array.length) {
                    i++;
                    j = 0;
                }
            }
        }
        return res;
    }
}