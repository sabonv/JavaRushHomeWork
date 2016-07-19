package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] name = new String[2];


        for (int i = 0; i < 2; i++)
        {
            name[i] = reader.readLine();
        }

        if (name[0].equals(name[1])){
            System.out.println("Имена идентичны");
        }
        else {
            if (name[0].length() == name[1].length() ){
                System.out.println("Длины имен равны");
            }

        }
    }
}
