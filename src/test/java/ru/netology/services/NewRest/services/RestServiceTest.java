package ru.netology.services.NewRest.services;

import org.junit.jupiter.api.Test;
import ru.netology.services.NewRest.services.RestService;

public class RestServiceTest {

    @Test
    void shouldCalculateNumberOfMonthsOfRest() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        // вызываем метод:
        int count = service.calculate(income, expenses, threshold);

        System.out.println(count);
    }
}