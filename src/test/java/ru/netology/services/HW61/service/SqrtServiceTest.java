package ru.netology.services.HW61.service;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")

    public void ToRestMonths(int income, int expenses, int threshold, int expected) {
        SqrtService service = new SqrtService();

        // int income = 10_000;
        // int expenses = 3_000;
        //  int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        // int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}


