package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();





        //напишите тут ваш код

        ArrayList<char[]> arr = new  ArrayList<char[]>();
        char[] tempS;
        tempS = s.toCharArray();
        String slovo = new String(), probel = new String();


        for (char b : tempS){

            if(b != ' '){
                slovo += Character.toString(b);
                if (!probel.equals("")) arr.add(probel.toCharArray());
                probel = "";
            }
            else {
                if (!slovo.equals("")) arr.add(slovo.toCharArray());
                slovo = "";
                probel += Character.toString(b);
            }


        }
        if (!slovo.equals("")) arr.add(slovo.toCharArray());
        if (!probel.equals("")) arr.add(probel.toCharArray());

        String result = new String();

        for (char[] arrS : arr){

            if (arrS[0]!=' '){
                arrS[0] = Character.toUpperCase(arrS[0]);
            }
            for (char tores : arrS){
                result += Character.toString(tores);
            }

        }




        System.out.println(result);

    }


}
