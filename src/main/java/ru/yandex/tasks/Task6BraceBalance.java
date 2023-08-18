// Extra task https://leetcode.com/problems/valid-parentheses/

package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        boolean result = true;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.substring(i, i+1).equals("[")
            || sequence.substring(i, i+1).equals("(")
            || sequence.substring(i, i+1).equals("{")) {
                stack.push(sequence.substring(i, i+1));
            } else {

                if ( sequence.substring(i, i+1).equals("]") && stack.peek().equals("[")
                        || sequence.substring(i, i+1).equals(")") && stack.peek().equals("(")
                        || sequence.substring(i, i+1).equals("}") && stack.peek().equals("{")
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.size() > 0) result = false;

        return result;
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }

    public static void main(String[] args) {
        selfCheck();
    }
}
