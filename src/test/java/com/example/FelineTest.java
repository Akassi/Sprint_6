package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamily() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getKittens() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Получено некорректное значение", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParameter() {
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals("Получено некорректное значение", expectedResult, actualResult);
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getFood() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.getFood("Хищник");
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }

    @Test
    public void getFoodWhenAnimal() throws Exception {
        List<String> expectedResult = List.of("Трава", "Различные растения");
        List<String> actualResult = feline.getFood("Травоядное");
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }
}