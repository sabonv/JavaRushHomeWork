package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.AbstractCollection;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        ArrayList<Human> femali = new ArrayList<Human>();

        Human ded1 = new Human("ded1", true, 101, null, null);
        femali.add(ded1);

        Human ded2 = new Human("ded2", true, 102, null, null);
        femali.add(ded2);

        Human baba1 = new Human("baba1", false, 99, null, null);
        femali.add(baba1);

        Human baba2 = new Human("baba2", false, 98, null, null);
        femali.add(baba2);

        Human otec = new Human("otec", true, 54, ded1, baba1);
        femali.add(otec);

        Human mat = new Human("mat", false, 45, ded2, baba2);
        femali.add(mat);

        Human sin1 = new Human("sin1", true, 10, otec, mat);
        femali.add(sin1);

        Human sin2 = new Human("sin2", true, 18, otec, mat);
        femali.add(sin2);

        Human doch1 = new Human("doch1", false, 20, otec, mat);
        femali.add(doch1);

        for(Human s : femali) System.out.println(s);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
