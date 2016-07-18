package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "zergusha1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zergusha2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zergusha3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zergusha4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "zergusha5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "zergusha6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "zergusha7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "zergusha8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "zergush9a";
        Zerg zerg10 = new Zerg();
        zerg10.name = "zergusha10";

        Protos protos1 = new Protos();
        protos1.name = "1protik";
        Protos protos2 = new Protos();
        protos2.name = "p2rotik";
        Protos protos3 = new Protos();
        protos3.name = "pr3otik";
        Protos protos4 = new Protos();
        protos4.name = "pro4tik";
        Protos protos5 = new Protos();
        protos5.name = "prot5ik";

        Terran terran1 = new Terran();
        terran1.name = "1terannik";
        Terran terran2 = new Terran();
        terran2.name = "t2erannik";
        Terran terran3 = new Terran();
        terran3.name = "te3rannik";
        Terran terran4 = new Terran();
        terran4.name = "ter4annik";
        Terran terran5 = new Terran();
        terran5.name = "tera5nnik";
        Terran terran6 = new Terran();
        terran6.name = "teran6nik";
        Terran terran7 = new Terran();
        terran7.name = "terann7ik";
        Terran terran8 = new Terran();
        terran8.name = "teranni8k";
        Terran terran9 = new Terran();
        terran8.name = "terannik9";
        Terran terran10 = new Terran();
        terran10.name = "10terannik";
        Terran terran11 = new Terran();
        terran11.name = "te11rannik";
        Terran terran12 = new Terran();
        terran12.name = "tera12nnik";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}