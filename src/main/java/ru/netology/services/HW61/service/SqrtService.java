package ru.netology.services.HW61.service;
public class SqrtService {
    public int calculate (int income, int expenses, int threshold) {
        int count = 0; //счетчик меясцев
        int money =0; //кол-во денег на счету
        for ( int month =1; month<12; month++) {
            if (money >= threshold) { //можем ли отдыхать?
                money = (money - expenses) / 3; //потрачено на отпуск
                count++; //увеличиваем счетчик месяцев отдыха
                System.out.println( "Месяц - " +month+ ". Денег - " +money+ ". Буду отдыхать " + ". Потратил - " +expenses+ ", затем еще - " + (money-expenses)/3);
            } else {
                money = money+(income-expenses); // потрачен без отпуска
                System.out.println( "Месяц - " +month+ ". Денег - " +money+ ". Придется работать " + ". Заработал - " +income+ ", потратил - " +expenses);
            }
        }
        return count;
    }

}

