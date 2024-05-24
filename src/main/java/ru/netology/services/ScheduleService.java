package ru.netology.services;

public class ScheduleService {

    public  int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        int temp;
        String expensesReport;
        String output;

        for (int month = 0; month < 12; month++) {
            temp = money;
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
                expensesReport = "Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + (temp - money);
            } else {
                money = money + income - expenses;
                expensesReport = "Придётся работать. Заработал +" + income + ", потратил -" + expenses;
            }
            output = "Месяц " + month + ". Денег " + temp + ". "+ expensesReport;
            System.out.println(output);
        }
        System.out.println("Всего удалось отдохнуть месяцев - " + count);
        return count;
    }



}
