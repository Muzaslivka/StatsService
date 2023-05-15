package ru.netology.stats;

public class StatsService {

    public int amountSales(int[] sales) { //Сумма всех продаж
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = sales[i] + total;
        }
        return total;
    }

    public int averageSales(int[] sales) {//Средняя сумму продаж в месяц
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = sales[i] + total;
        }
        int averageAmount = total / sales.length;
        return averageAmount;
    }


    public int maxSales(int[] sales) {//Номер месяца, в котором был максимум продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {//Номер месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public int belowAverageSales(int[] sales) {//Количество месяцев, в которых продажи были ниже среднего
        int averageAmount = averageSales(sales);
        int countMinMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                countMinMonths = countMinMonths + 1;
            }
        }

        return countMinMonths;
    }

    public int aboveAverageSales(int[] sales) {//Количество месяцев, в которых продажи были выше среднего
        int averageAmount = averageSales(sales);
        int countMaxMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                countMaxMonths = countMaxMonths + 1;
            }
        }

        return countMaxMonths;
    }


}