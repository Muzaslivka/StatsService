package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateAmountOfSales1() {
        StatsService service = new StatsService();

        int actual = service.amountSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        int expected = 180;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverageSales2() {
        StatsService service = new StatsService();

        int actual = service.averageSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        int expected = 15;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfMonthMaxSales3() {
        StatsService service = new StatsService();

        int actual = service.maxSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfMonthMinSale4() {
        StatsService service = new StatsService();

        int actual = service.minSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        int expected = 9;


        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateBelowAverageSales5() {
        StatsService service = new StatsService();

        int actual = service.belowAverageSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        int expected = 5;


        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAboveAverageSales6() {
        StatsService service = new StatsService();

        int actual = service.aboveAverageSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        int expected = 5;


        Assertions.assertEquals(expected, actual);

    }


}