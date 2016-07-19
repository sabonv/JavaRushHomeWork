package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Stack;

public class Dog
{
    //напишите тут ваш код

    public String name;
    public String color;
    public int hig;

    public void initialize(String name){
        this.name=name;

    }
    public void initialize(String name, int hig){
        this.name=name;
        this.hig=hig;
    }
    public void initialize(String name, int hig, String color){
        this.name=name;
        this.hig=hig;
        this.color=color;
    }

}
