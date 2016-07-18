package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name, password, login, city;
        int age;
        boolean sex;

        public Human (String name, int age, boolean sex){//1
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (String login, String password, int age){//2
            this.login = login;
            this.password = password;
            this.age = age;
        }
        public Human (String name, String city){//3
            this.name = name;
            this.city = city;
        }
        public Human(String name, boolean sex){//4
            this.name = name;
            this.sex = sex;
        }
        public Human(int age, boolean sex){//5
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex, int age){//6
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, String login, String password, boolean sex){//7
            this.name = name;
            this.login = login;
            this.password = password;
            this.sex = sex;
        }
        public Human(int age){//8
            this.age = age;
        }
        public Human(String name){//9
            this.name = name;

        }
        public Human(boolean sex){//410

            this.sex = sex;
        }


    }
}
