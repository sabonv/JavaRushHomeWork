package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код

    private int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int top, int left){
        this.top=top;
        this.left=left;
    }
    public Rectangle(int left, int top, int width){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=this.width;
    }
    public Rectangle(Rectangle copyy){
        this.top=copyy.top;
        this.left=copyy.left;
        this.width=copyy.width;
        this.height=copyy.height;
    }
}
