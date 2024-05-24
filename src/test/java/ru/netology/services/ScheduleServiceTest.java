package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScheduleServiceTest {

    ScheduleService service = new ScheduleService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testParams.csv")
    public void testScheduleService(int income, int expenses, int threshold, int expected) {

        int result = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(result, expected);
    }

}
