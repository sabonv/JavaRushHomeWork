package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код

        ArrayList<String>[] tempE =  new ArrayList[2];

        for (int i = 0; i < 2; i++)
        {
            ArrayList<String> tempI =  new ArrayList<String>();
            for (int j = 0; j < 2; j++)
            {
                tempI.add("name"+i+" "+j);
            }
            tempE[i] = tempI;

        }


        return tempE;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}