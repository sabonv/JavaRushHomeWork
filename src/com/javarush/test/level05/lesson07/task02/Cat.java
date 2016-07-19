package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    public String name = null;
    public String adres = null;
    public String color = null;
    public int age = 2;
    public int weth = 2;

    public void initialize (String name)
    {
        this.name = name;
    }

    public void initialize (String name, int weth, int age)
    {
        this.name = name;
        this.weth = weth;
        this.age = age;
    }

    public void initialize (String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weth = 2;
    }

    public void initialize (int weth, String color)
    {
        this.weth = weth;
        this.color = color;
        this.name = null;
        this.adres = null;
        this.age = 2;
    }

    public void initialize(int weth, String color, String adres)
    {
        this.weth = weth;
        this.color = color;
        this.adres = adres;
    }




}
