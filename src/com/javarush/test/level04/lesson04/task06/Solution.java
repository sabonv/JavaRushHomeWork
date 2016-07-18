package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String che = reader.readLine();
        int chei = Integer.parseInt(che);

        if ((chei > 0) && (chei < 8)){
            if (chei == 1) System.out.println("понедельник");
            if (chei == 2) System.out.println("вторник");
            if (chei == 3) System.out.println("среда");
            if (chei == 4) System.out.println("четверг");
            if (chei == 5) System.out.println("пятница");
            if (chei == 6) System.out.println("суббота");
            if (chei == 7) System.out.println("воскресенье");
        }
        else {
            System.out.println("такого дня недели не существует");
        }

    }

}