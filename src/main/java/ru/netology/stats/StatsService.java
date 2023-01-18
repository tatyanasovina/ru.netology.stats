package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximumSale(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumMonth = i;
                maximumSale = sales[i];
            }

        }
        return maximumMonth + 1;
    }

    public int minimumSale(long[] sales) {
        int minimumMonth = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumMonth = i;
                minimumSale = sales[i];
            }

        }
        return minimumMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherAverage(long[] sales) {
        int counter = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
