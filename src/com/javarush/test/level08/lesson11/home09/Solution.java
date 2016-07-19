package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "JANUARY 2 2013";
       // isDateOdd(s);
        System.out.println(s + " = "+isDateOdd(s));

    }

    public static boolean isDateOdd(String date)
    {
        Date temp = new Date(date);
        long mstime = temp.getTime() - temp.getYear();
        long msDay = 24 * 60 * 60 * 1000;
        if ((mstime/msDay)%2!=0) return true;
        else return false;





    }
}
