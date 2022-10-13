package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTests {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.isAdult(19);
        assertEquals("Должно вернуться true, так как возрат 18 или страше", true, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.isAdult(18);
        assertEquals("Должно вернуться true, так как возрат 18", true, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.isAdult(17);
        assertEquals("Должно вернуться false, так как возрат младше 18", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsNegativeNumberFalse() {
        Program program = new Program();
        boolean isAdult = program.isAdult(-19);
        assertEquals("Должно вернуться false, так как возрат не может быть отрицательным числом", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsZeroFalse() {
        Program program = new Program();
        boolean isAdult = program.isAdult(0);
        assertEquals("Должно вернуться false, так как возрат не может 0", false, isAdult);
    }
}