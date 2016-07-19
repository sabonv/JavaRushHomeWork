package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];


        for (int i = 0; i < 3; i++)
        {
            String che = reader.readLine();
            arr[i] = Integer.parseInt(che);

        }

       // int max = 0, min = 0;

        for (int i = arr.length-1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if( arr[j] > arr[j+1] )
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
