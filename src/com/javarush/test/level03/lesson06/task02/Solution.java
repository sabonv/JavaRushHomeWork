package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int[] gor = new int[10];
        int[] ver = new int[10];

        for (int i = 0; i < gor.length; i++){
            gor[i] = i+1;
            ver[i] = i+1;
        }

        //System.out.print(" ");

        for (int x = 0; x < gor.length; x++){

            for (int y = 0; y < ver.length; y++){
                System.out.print((gor[x]*ver[y]) + " ");
            }
            System.out.println("");
        }
    }
}