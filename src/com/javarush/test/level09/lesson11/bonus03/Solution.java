package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код

        for (int i = array.length; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {

                if(isNumber(array[j])) //если выбранный символ цифра
                {
                    int k = j + 1;

                    for(k = j + 1; k<i; k++) //ищим вторую цифру
                    {
                        if (isNumber(array[k])) //если вторая цифра найдена
                        {

                            if (Integer.parseInt(array[j]) < Integer.parseInt(array[k])) //гоним пузырь
                            {
                                String temp;
                                temp = array[k];
                                array[k] = array[j];
                                array[j] = temp;
                            }
                        }
                    }
                }

                else{ //если выбранный символ буква

                    int m = j + 1;

                    for(m = j + 1; m<i; m++) //ищим вторую букву
                    {
                        if (!isNumber(array[m])) //если вторая буква найдена
                        {

                            if (isGreaterThan(array[j], array[m])) //гоним пузырь
                            {
                                String temp;
                                temp = array[m];
                                array[m] = array[j];
                                array[j] = temp;
                            }
                        }
                    }


                }

            }
        }


        for (String s : array){



            if (isNumber(s)){

            }
            else {

            }

        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
