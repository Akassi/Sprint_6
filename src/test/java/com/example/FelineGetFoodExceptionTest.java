package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetFoodExceptionTest {

    private final String ANIMAL_KIND;

    public FelineGetFoodExceptionTest(String animalKind) {
        this.ANIMAL_KIND = animalKind;
    }

    @Parameterized.Parameters
    public static Object[] invalidFelineAnimalKind() {
        return new Object[]{
                null,
                "Predator",
                "Herbivore",
                "Всеядное",
                "Undefined"
        };
    }

    @Test(expected = java.lang.Exception.class)
    public void getFoodInvalidAnimalKindException() throws Exception {
        Feline feline = new Feline();
        try {
            feline.getFood(ANIMAL_KIND);
        } catch (Exception exception) {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}