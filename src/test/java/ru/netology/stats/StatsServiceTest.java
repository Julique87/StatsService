package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void shouldGetSum() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 180;
        long actual = service.getSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 15;
        double actual = service.getAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoildGetMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.getMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoildGetMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.getMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoildGetCountMonthUnderAwerage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.getCountMonthUnderAwerage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoildGetCountMonthUpperAwerage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.getCountMonthUpperAwerage(sales);
        assertEquals(expected, actual);
    }
}