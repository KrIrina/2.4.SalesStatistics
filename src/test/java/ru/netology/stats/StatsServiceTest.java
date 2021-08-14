package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

class StatsServiceTest {

    @Test
    public void ShouldTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.totalSales(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldAverageSalesToMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSalesToMonth(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCountOfMonthSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countOfMonthSalesBelowAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCountOfMonthSalesOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countOfMonthSalesOverAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}
