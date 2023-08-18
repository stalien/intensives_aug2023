// Extra task https://leetcode.com/problems/sort-vowels-in-a-string/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int right = numbers.size()-1;
        int count = 0;

        while (right > 0) {
            for (int i = 0; i < right; i++) {
                if (numbers.get(i) > numbers.get(i+1)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(i+1));
                    numbers.set(i+1, temp);
                    count++;
                }
            }
            if (count == 0) break;
            right--;
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
