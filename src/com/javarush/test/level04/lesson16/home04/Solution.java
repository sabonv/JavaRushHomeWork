package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.nio.channels.Pipe;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String[] arr = new String[3];



        for (int i = 0; i < 3; i++)
        {
            arr[i] = reader.readLine() ;
        }
        System.out.println("Меня зовут "+name);
        System.out.println(" Я родился "+arr[2]+"."+arr[1]+"."+arr[0]);

    }
}
