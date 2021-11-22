package com.epam.training.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, -2);

        //then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testDeductShouldDeductWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.deduct(5, 10);

        //then
        Assert.assertEquals(-5, result);
    }

    @Test
    public void testDeductShouldDeductWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.deduct(-2, -6);

        //then
        Assert.assertEquals(4, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(2, 3);

        //then
        Assert.assertEquals(6, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-3, -4);

        //then
        Assert.assertEquals(12, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(9, 4);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(-9, -3);

        //then
        Assert.assertEquals(3, result);
    }

}
