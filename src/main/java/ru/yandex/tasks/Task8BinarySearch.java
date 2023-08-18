// Extra task https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package ru.yandex.tasks;

public class Task8BinarySearch {
    public static int find(int number, int[] sortedList) {
        /*
         * number: целое число, -10^5 <= number <= 10^5
         * numbers: массив целых чисел, 0 <= numbers.length <= 10^5
         * Выход: i, где numbers[i] = number, -1, если такого i нет
         * Если таких i несколько, вывести наибольший
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        int l = 0;
        int r = sortedList.length;
        int m = (l+r)/2;

        while (r - l > 1) {
            m = (l+r)/2;

            if (sortedList[m] == number) {
                return m;
            }
            if (sortedList[m] > number) {
                r = m;
            } else {
                l = m;
            }
        }

        if (r - l == 1) {
            if (sortedList[m-1] == number) return m-1;
            if (sortedList[m] == number) return m;
            return -1;
        }

        return m;
    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }
    }

    public static void main(String[] args) {
        selfCheck();
    }
}
