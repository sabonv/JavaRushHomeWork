package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String che1 = reader.readLine();
        int che1i = Integer.parseInt(che1);

        if (che1i > 0 ){
            che1i = che1i * 2;

        }

        else {
            che1i = che1i + 1;
        }
        System.out.println(che1i);

    }

}