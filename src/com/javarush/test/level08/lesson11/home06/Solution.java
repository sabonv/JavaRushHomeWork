package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код


        Human ded1 = new Human("ded1", true, 94, null, null );
        Human baba1 = new Human("bab1", false, 84, null, null );

        Human ded2 = new Human("ded2", true, 84, null, null );
        Human baba2 = new Human("bab2", false, 74, null, null );

        Human papa = new Human("papa", true, 44, ded1, baba1 );
        Human mama = new Human("mama", false, 34, ded2, baba2 );

        Human chi1 = new Human("chi1", true, 11, papa, mama);
        Human chi2 = new Human("chi2", false, 12, papa, mama);
        Human chi3 = new Human("chi3", true, 13, papa, mama);



        System.out.println(chi1);
        System.out.println(chi2);
        System.out.println(chi3);

        System.out.println(papa);
        System.out.println(mama);

        System.out.println(ded1);
        System.out.println(baba1);

        System.out.println(ded2);
        System.out.println(baba2);


    }

    public static class Human
    {
        //напишите тут ваш код
        String name = new String();
        boolean sex = true;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, Human mama, Human papa){

            this.name = name;
            this.sex = sex;
            this.age = age;
            if(mama!=null) mama.children.add(this);
            if(papa!=null) papa.children.add(this);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
