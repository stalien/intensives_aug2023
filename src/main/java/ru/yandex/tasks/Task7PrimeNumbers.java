// Extra task https://leetcode.com/problems/prime-in-diagonal/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        LinkedList<Integer> sortedList = new LinkedList<>();
        LinkedList<Integer> outList = new LinkedList<>();

        for (int i = 2; i <= N; i++) {
            if (!outList.contains(i)) {
                sortedList.add(i);
            }
            for (int j = i*i; j <= N; j += i) {
                outList.add(j);
            }
            }


        return sortedList.stream().mapToInt(i -> i).toArray();
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }

    public static void main(String[] args) {
        selfCheck();
    }
}
