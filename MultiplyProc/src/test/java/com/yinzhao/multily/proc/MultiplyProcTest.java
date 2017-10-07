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

    @Test
    public void test_3_multiply_5_equal_15() {
        assertEquals("15", multiplier.multiply("3", "5"));
    }

    @Test
    public void test_123_multiply_3_equal_369() {
        assertEquals("369", multiplier.multiply("123", "3"));
    }

    @Test
    public void test_123_multiply_5_equal_615() {
        assertEquals("615", multiplier.multiply("123", "5"));
    }

    @Test
    public void test_123_multiply_21_equal_2583() {
        assertEquals("2583", multiplier.multiply("123", "21"));
    }

    @Test
    public void test_123_multiply_55_equal_6765() {
        assertEquals("6765", multiplier.multiply("123", "55"));
    }


    @Test
    public void test_999999_multiply_88888_equal_888879111112() {
        assertEquals("88887911112", multiplier.multiply("999999", "88888"));
    }

}
