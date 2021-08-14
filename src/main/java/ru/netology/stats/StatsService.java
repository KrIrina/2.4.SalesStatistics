package ru.netology.stats;

public class StatsService {
    public long totalSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSalesToMonth(long[] sales) {
        long sum = totalSales(sales);  // сумма всех продаж
        long averageSales = sum / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long countOfMonthSalesBelowAverage(long[] sales) {
        long averageSales = averageSalesToMonth(sales); // средняя сумма продаж
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

    public long countOfMonthSalesOverAverage(long[] sales) {
        long averageSales = averageSalesToMonth(sales); // средняя сумма продаж
        int month = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                month = month + 1;
            }
        }
        return month;
    }
}

