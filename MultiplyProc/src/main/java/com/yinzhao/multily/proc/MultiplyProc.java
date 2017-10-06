package com.yinzhao.multily.proc;

public class MultiplyProc {
    public String multiply(String m1, String m2) {
        int a = char2Int(m1.toCharArray()[0]);
        int b = char2Int(m2.toCharArray()[0]);
        int ret = a * b;
        return String.valueOf(ret);
    }

    private int char2Int(char c) {
        return Integer.parseInt(String.valueOf(c));
    }
}
