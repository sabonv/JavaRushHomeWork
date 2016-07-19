package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String che1 = reader.readLine();
        String che2 = reader.readLine();

        int che1i = Integer.parseInt(che1), che2i = Integer.parseInt(che2);

        if (che1i < che2i){
            System.out.println(che1i);
        }
        else System.out.println(che2i);

    }
}