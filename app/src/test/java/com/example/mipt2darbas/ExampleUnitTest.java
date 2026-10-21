package com.example.mipt2darbas;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.mipt2darbas.utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void test1_emptyString_getNumbers(){

        String inputString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.countNumbers(inputString);

        assertEquals(expectedValue, actualValue);

    }


    @Test
    public void test2_numericString_getNumbers(){

        String inputString = "1 2 3";
        int expectedValue = 3;
        int actualValue = TextCounter.countNumbers(inputString);

        assertEquals(expectedValue, actualValue);

    }


    @Test
    public void test3_nullString_getNumbers(){

        String inputString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.countNumbers(inputString);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void test4_alphaNumericString_getNumbers(){

        String inputString = "Labas rytas 5";
        int expectedValue = 1;
        int actualValue = TextCounter.countNumbers(inputString);

        assertEquals(expectedValue, actualValue);

    }

}