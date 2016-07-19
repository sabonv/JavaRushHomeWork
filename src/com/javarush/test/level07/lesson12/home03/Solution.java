package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = arr.length-1; i >0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if(arr[j]>arr[j+1]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        minimum = arr[0];
        maximum = arr[arr.length-1];
        //напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
