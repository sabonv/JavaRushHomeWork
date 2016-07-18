package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("sasha", "dom1", 13);
        Man man2 = new Man("kakasha", "dom2", 14);
        Woman woman1 = new Woman("dasha", "dom3", 15);
        Woman woman2 = new Woman("kasha", "dom4", 18);



        //выведи их на экран тут
    }
    public static class Man{
        String name, address;
        int age;

        public Man(String name, String address, int age){
            this.name=name;
            this.address=address;
            this.age=age;
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }

    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, String address, int age){
            this.name=name;
            this.address=address;
            this.age=age;
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
    //добавьте тут ваши классы
}
