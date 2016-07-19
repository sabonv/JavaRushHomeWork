package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код

    private String name;
    private int hig;
    private String color;

    public Dog(String name){
        this.name=name;
    }
    public Dog(String name, int hig){
        this.name=name;
        this.hig=hig;
    }
    public Dog(String name, int hig, String color){
        this.name=name;
        this.hig=hig;
        this.color=color;
    }


}
