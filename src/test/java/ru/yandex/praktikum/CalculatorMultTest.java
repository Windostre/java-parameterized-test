package ru.yandex.praktikum;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorMultTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorMultTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameters
    public static Object[] [] getMultData() {
        return new Object[][] {
                {0,0,0},
                {1,-1,-1},
                {3,0,0},
                {5,8,40}

        };
    }

    @Test
    public void shouldBeMult() {
        Calculator calculator = new Calculator();
        int actual = calculator.mult(firstNumber,secondNumber);
        Assert.assertEquals(actual,expected);
    }


}