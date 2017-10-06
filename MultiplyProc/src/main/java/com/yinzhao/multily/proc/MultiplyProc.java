package com.yinzhao.multily.proc;

import java.util.Arrays;

public class MultiplyProc {
    public String multiply(String m1, String m2) {
        char[] retArray = new char[m1.length() * m2.length() + 1];

        char[] array1 = m1.toCharArray();
        char[] array2 = m2.toCharArray();

        int retIndex = 0;
        for (char c : array1) {
            int a = char2Int(c);
            int b = char2Int(array2[0]);
            retIndex = mulAndPutInArray(retArray, b, a, retIndex);
        }
        return valueOf(retArray, retIndex);
    }

    private int mulAndPutInArray(char[] retArray, int b, int a, int retIndex) {
        int ret = a * b;
        int advance = ret / 10;
        int remainder = ret % 10;

        if (advance != 0) {
            retArray[retIndex++] = Character.forDigit(advance, 10);
        }
        retArray[retIndex++] = Character.forDigit(remainder, 10);
        return retIndex;
    }

    private String valueOf(char[] retArray, int len) {
        char[] arr = Arrays.copyOf(retArray, len);
        return String.valueOf(arr);
    }

    private int char2Int(char c) {
        return Integer.parseInt(String.valueOf(c));
    }
}
