package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = Integer.parseInt(reader.readLine());
        //int b = Integer.parseInt(reader.readLine());

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = min(arr);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] arr)
    {
        for (int i = arr.length-1; i >0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr[arr.length-1];
    }

}
