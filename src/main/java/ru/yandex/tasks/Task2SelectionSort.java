// Extra task https://leetcode.com/problems/minimum-index-of-a-valid-split/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        int left = 0;

        while (left < numbers.size()) {
            int min = numbers.get(left);
            int minIdx = 0;
            for (int i = left; i < numbers.size(); i++) {
                if (numbers.get(i) < min) {
                    min = numbers.get(i);
                    minIdx = i;
                }
            }
            if (minIdx > 0) {
                int tmp = numbers.get(left);
                numbers.set(left, min);
                numbers.set(minIdx, tmp);
            }
            left++;
        }

        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }

    public static void main(String[] args) {
        selfCheck();
    }
}
