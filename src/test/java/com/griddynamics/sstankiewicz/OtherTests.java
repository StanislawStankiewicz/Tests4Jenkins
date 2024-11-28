package com.griddynamics.sstankiewicz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OtherTests {

    @Test
    public void testMultiplication() {
        int a = 4;
        int b = 5;
        int result = a * b;
        Assert.assertEquals(result, 20, "Multiplication result is incorrect!");
    }

    @Test
    public void testDivision() {
        int a = 10;
        int b = 2;
        int result = a / b;
        Assert.assertEquals(result, 5, "Division result is incorrect!");
    }

    @Test
    public void testStringContains() {
        String mainString = "Continuous Integration with Jenkins";
        Assert.assertTrue(mainString.contains("Jenkins"), "String does not contain 'Jenkins'!");
    }

    @Test
    public void testIntentionalFailure() {
        // This test is designed to fail
        int a = 5;
        int b = 3;
        int result = a + b;
        Assert.assertEquals(result, 10, "This test is intentionally set to fail!");
    }

    @Test
    public void testArraySorting() {
        int[] numbers = {5, 2, 8, 1};
        java.util.Arrays.sort(numbers);
        Assert.assertEquals(numbers, new int[]{1, 2, 5, 8}, "Array sorting failed!");
    }
}
