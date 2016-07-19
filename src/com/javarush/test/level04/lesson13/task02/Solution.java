package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(reader.readLine()), g = Integer.parseInt(reader.readLine());

        for (int i = 0; i < v; i++){
            for (int j = 0; j < g; j++)
            {
                System.out.print("8");
            }

            System.out.println("");
        }




    }
}
