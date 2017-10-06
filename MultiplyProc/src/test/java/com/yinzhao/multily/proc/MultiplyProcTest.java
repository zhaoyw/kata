package com.yinzhao.multily.proc;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplyProcTest {

    private MultiplyProc multiplier;

    @Before
    public void setUp() {
        multiplier = new MultiplyProc();
    }

    @Test
    public void test_2_multiply_2_equal_6() {
        assertEquals("6", multiplier.multiply("2", "3"));
    }

    @Test
    public void test_1_multiply_7_equal_7() {
        assertEquals("7", multiplier.multiply("1", "7"));
    }


}
