package com.griddynamics.sstankiewicz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeTests {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int result = a + b;
        Assert.assertEquals(result, 15, "Addition result is incorrect!");
    }

    @Test
    public void testSubtraction() {
        int a = 20;
        int b = 5;
        int result = a - b;
        Assert.assertEquals(result, 15, "Subtraction result is incorrect!");
    }

    @Test
    public void testStringConcatenation() {
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        Assert.assertEquals(result, "Hello World", "String concatenation failed!");
    }

    @Test
    public void testListSize() {
        java.util.List<String> list = java.util.Arrays.asList("one", "two", "three");
        Assert.assertEquals(list.size(), 3, "List size is incorrect!");
    }

    @Test
    public void testNullPointer() {
        String str = null;
        Assert.assertNull(str, "String should be null!");
    }
}
