package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

import com.javarush.test.level05.lesson05.task04.Solution;

public class Cat
{
    //напишите тут ваш код

    private String name=null;
    private String color="gray";
    private String adres=null;
    private int age=2;
    private int whed=2;

    public Cat(String name){
        this.name=name;
        this.age=2;
        this.whed=2;
        this.color="gray";




    }

    public Cat(String name, int whed, int age){
        this.name=name;
        this.whed=whed;
        this.age=age;
    }

    public Cat(String name, int age){
        this.name=name;
        this.age=age;
        this.whed=2;
    }

    public Cat(int whed, String color){
        this.whed=whed;
        this.color=color;
        this.name=null;
        this.adres=null;
        this.age=2;
    }

    public Cat(int whed, String color, String adres){
        this.whed=whed;
        this.color=color;
        this.adres=adres;

    }


}
