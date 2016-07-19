package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] che = new int[3];

        for (int i = 0; i < che.length; i++)
        {
            che[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = che.length-1; i > 0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (che[j] > che[j+1]){
                    int tmp = che[j];
                    che[j] = che[j+1];
                    che[j+1]=tmp;
                }
            }
        }
        System.out.println(che[1]);

    }
}
