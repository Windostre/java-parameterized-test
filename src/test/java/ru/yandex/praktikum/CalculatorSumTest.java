package ru.yandex.praktikum;

import org.junit.Test;
// импорт класса Parameterized и аннотации RunWith
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class) // указали, что тесты будет запускать раннер Parameterized

public class CalculatorSumTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorSumTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

   @Parameterized.Parameters // Добавили анотацию
    public static Object[] [] getSumData(){
        return new Object[][] {
                {1,9,10},
                {1,0,1}
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }


}