package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionConstructorExceptionTest {

    Feline feline;
    private final String SEX;

    public LionConstructorExceptionTest(String Sex) {
        this.SEX = Sex;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[] invalidLionSexes() {
        return new Object[]{
                null,
                "Лев",
                "Львица",
                "Male",
                "Female",
                "Lion",
                "Undefined"
        };
    }

    @Test(expected = java.lang.Exception.class)
    public void ConstructorInvalidSexException() throws Exception {
        try {
            Lion lion = new Lion(SEX, feline);
        } catch (Exception exception) {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}