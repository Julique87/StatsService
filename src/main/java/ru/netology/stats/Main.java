package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long sum = service.getSum(sales);
        System.out.println("Сумма всех продаж: " + sum);

        double average = service.getAverage(sales);
        System.out.println("Средняя цена: " + average);

        int maxMonth = service.getMaxMonth(sales);
        System.out.println("Месяц максимальных продаж: " + maxMonth);

        int minMonth = service.getMinMonth(sales);
        System.out.println("Месяц минимальных продаж: " + minMonth);

        int counthMonthUnderAverage = service.getCountMonthUnderAwerage(sales);
        System.out.println("Количество месяцев,в которых продажи были выше среднего: " + counthMonthUnderAverage);

        int counthMonthUpperAverage = service.getCountMonthUpperAwerage(sales);
        System.out.println("Количество месяцев,в которых продажи были выше среднего: " + counthMonthUpperAverage);
    }
}