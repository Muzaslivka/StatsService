package ru.netology;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        int sumOfSales = service.amountSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Сумма всех продаж: " + sumOfSales);

        int allSalesAverage = service.averageSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Средняя сумма продаж в месяц: " + allSalesAverage);

        int numberMonthMaxSale = service.maxSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Номер месяца, в котором был максимум продаж: " + numberMonthMaxSale);

        int numberMonthMinSale = service.minSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Номер месяца, в котором был минимум продаж: " + numberMonthMinSale);

        int amountMaxMonths = service.belowAverageSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + amountMaxMonths);

        int amountMinMonths = service.aboveAverageSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + amountMinMonths);

    }
}