package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ProgramTestParam {
    private final int age;
    private final boolean result;

    public ProgramTestParam(int age, boolean result) {
        this.age = age;
        this.result = result;
    }
    @Parameterized.Parameters(name = "возраст = {0}, совершеннолетний? = {1}")
    public static Object[] [] getTestData() {
        return new Object[][] {
                {-1, false},
                {-0, false},
                {17, false},
                {18, true},
                {19,true},
                {21, true}

        };
    }

    @Test
    public void checkWhenIsAdultThenResult() {
        Program program = new Program();
        boolean isAdult = program.isAdult(age);
        assertEquals("Ожидается " + result + ", так как возраст " + age + ". ", result, isAdult);

    }
}
