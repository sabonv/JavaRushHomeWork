package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println( convertEurToUsd(100, 3.1));
       System.out.println( convertEurToUsd(200, 3.5)        );

    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код
        return eur * course;
    }
}
