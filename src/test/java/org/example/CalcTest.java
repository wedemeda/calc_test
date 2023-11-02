package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest(name = "Test-id {index}: сложение {0} и {1} равно {2}")
    @CsvSource({"1,5,6","-2,-7,-9","5,0,5"})
    @Tag("summ")
    @DisplayName("Проверка суммирования")
    void summ(int a, int b, int expectedResult) {
        Calc calc  = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "Test-id {index}: разность {0} и {1} равно {2}")
    @CsvSource({"3,2,1","-2,-7,5","0,5,-5"})
    @Tag("subtr")
    @DisplayName("Проверка вычитания")
    void subtr(int a, int b, int expectedResult) {
        Calc calc  = new Calc();
        int result = calc.subtr(a,b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}