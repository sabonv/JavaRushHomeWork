package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int che = 1;

        while (che < 101){
            if ((che%10)==0){
                System.out.println("S");
            }
            else System.out.print("S");
            che++;
        }

    }
}
