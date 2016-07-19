package com.javarush.test.level06.lesson11.bonus03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> temp = new ArrayList<>();
        int tmp=0;

        for (int i = 0; i < 5; i++)
        {
            temp.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = temp.size()-1; i >= 0; i--)
        {
         //   int a = temp.get(i);
            //System.out.println(temp.get(i));
            for (int j = 0; j < temp.size()-1; j++)
            {

                //int b = temp.get(j);

                if( temp.get(j) > temp.get(j+1)){

                    tmp = temp.get(j+1);
                    temp.set(j+1, temp.get(j));
                    temp.set(j, tmp);
                    //System.out.println("DA?");

                }
            }
        }

        for (int i = 0; i < temp.size(); i++)
        {
            System.out.println(temp.get(i));
        }

        //напишите тут ваш код
    }
}
