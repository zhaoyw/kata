package com.yinzhao.multily.proc;

import java.util.Arrays;

public class MultiplyProc {
    public String multiply(String m1, String m2) {
        char[] retArray = new char[m1.length() * m2.length()];

        char[] array1 = m1.toCharArray();
        char[] array2 = m2.toCharArray();

        int begin = 0; // begin index of add position
        int len = 0; // valid result lengh
        for (int j = array2.length - 1; j >= 0; j--) {
            int b = char2Int(array2[j]);
            len = singleDigitMultiplyMultiDigits(retArray, array1, begin, b);
            begin++;
        }

        return valueOf(retArray, len);
    }

    private int singleDigitMultiplyMultiDigits(char[] retArray, char[] array1, int begin, int b) {
        int advance = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            int a = char2Int(array1[i]);
            int ret = a * b + advance;
            if (retArray[begin] != '\u0000') {
                ret += char2Int(retArray[begin]); // convert char to int, it is very important
            }

            int remainder = ret % 10;
            retArray[begin++] = Character.forDigit(remainder, 10);
            advance = ret / 10;
        }
        if (advance != 0) {
            retArray[begin++] = Character.forDigit(advance, 10);
        }
        return begin;
    }

    private String valueOf(char[] retArray, int len) {
        char[] arr = Arrays.copyOf(retArray, len);
        reverseArray(arr);
        return String.valueOf(arr);
    }

    private void reverseArray(char[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    private int char2Int(char c) {
        return Integer.parseInt(String.valueOf(c));
    }
}
