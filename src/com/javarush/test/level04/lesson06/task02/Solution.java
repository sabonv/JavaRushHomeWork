package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int[] arr = new int[4];
        int max =0;


        for (int i = 0; i < 4; i++)
        {
            String che = reader.readLine();
           // arr[i] = Integer.parseInt(che);
            if (max <Integer.parseInt(che)){
                max = Integer.parseInt(che);
            }

        }

       /* for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {


                    if (arr[i]<arr[j]){
                        if ((j != max))
                        {
                            max = j;
                            i = j;
                            j = 0;

                        }
                    }




            }
        }*/
        System.out.println(max);
    }
}
