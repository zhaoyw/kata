package com.yinzhao.multily.proc;

import java.util.Arrays;

public class MultiplyProc {
    public String multiply(String m1, String m2) {
        char[] retArray = new char[m1.length() * m2.length() + 1];

        char[] array1 = m1.toCharArray();
        char[] array2 = m2.toCharArray();

        int beginOfAddPos = 0;
        int len = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            int a = char2Int(array1[i]);
            int b = char2Int(array2[0]);
            len = mulAndPutInArray(retArray, b, a, beginOfAddPos);
            beginOfAddPos++;
        }
        return valueOf(retArray, len);
    }

    private int mulAndPutInArray(char[] retArray, int b, int a, int beginOfAddPos) {
        int ret = a * b;
        if (retArray[beginOfAddPos] != '\u0000') {
            ret += char2Int(retArray[beginOfAddPos]);
        }
        int advance = ret / 10;
        int remainder = ret % 10;

        retArray[beginOfAddPos++] = Character.forDigit(remainder, 10);

        if (advance != 0) {
            retArray[beginOfAddPos++] = Character.forDigit(advance, 10);
        }
        return beginOfAddPos;
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
