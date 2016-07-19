package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3] ;
        int x = 0;

        for (int i = 0; i < 3; i++)
        {
            String che = reader.readLine();
            arr[i] = Integer.parseInt(che);
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i!=j){
                    if (arr[i] == arr[j]){
                        x=x+1;
                        if (x<4)
                        {
                            System.out.print(arr[j] + " ");
                        }
                    }
                }
            }
        }

    }
}