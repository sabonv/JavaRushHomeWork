package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int[] triu = new int[3];
        int x = 0;
        boolean test = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++)
        {
            triu[i] = Integer.parseInt (reader.readLine());
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(i!=j){
                   x = x + triu[j];

                }
            }
            //System.out.println(x);
            if ((x - triu[i])<=0){
                test = false;
                break;
            }
            x = 0;

        }
        if(!test){
            System.out.println("Треугольник не существует.");
        }
        else System.out.println("Треугольник существует.");

    }
}