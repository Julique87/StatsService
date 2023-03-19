package ru.netology.stats;

public class StatsService {
    public long getSum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double getAverage(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        double average = sum / sales.length;
        return average;
    }


    public int getMaxMonth(long[] sales) {
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


    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getCountMonthUnderAwerage(long[] sales) {
        int countUnder = 0;
        double awerage = getAverage(sales);
        for (long sale : sales) {
            if (sale < awerage) {
                countUnder ++;
            }
        }
        return countUnder;
    }

    public int getCountMonthUpperAwerage(long[] sales) {
        int countUpper = 0;
        double awerage = getAverage(sales);
        for (long sale : sales) {
            if (sale > awerage) {
                countUpper++;
            }
        }
        return countUpper;
    }
}
