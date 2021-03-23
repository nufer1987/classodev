package ClassMetCons;

import sun.java2d.pipe.AAShapePipe;

import java.util.ArrayList;

public class mainn {
    public static void main(String[] args) {
        Person1();
        Person2();
        Person3();





    }
    public static void Person1(){


        Araba araba6=new Araba("golf",2020,15000);


        ArrayList <Araba> perar1=new ArrayList<>();
        perar1.add(araba6);
        Person person1=new Person("nazım","simsek",
                123456,new Cocuk("azra","sımsek",12,true),perar1);
        person1.cocuk1.setYas(13);
        person1.cocuk1.setIsim("ayse");
        System.out.println(person1.toString());

}
    public static void Person2()
    {   Araba araba4=new Araba("golf",2016,15000);
        Araba araba5=new Araba("golf",2017,15000);
        ArrayList <Araba> perar2=new ArrayList<>();
        perar2.add(araba4);
        perar2.add(araba5);

        Person person2=new Person("nazım","simsek",
                123456,new Cocuk("azra","sımsek",12,true),perar2);
        araba4.setGuncelfiyat(500000);
        System.out.println(person2.toString());

    }
    public static void Person3(){
        Araba araba1=new Araba("golf",2013,15000);
        Araba araba2=new Araba("golf",2011,15000);
        Araba araba3=new Araba("golf",2015,15000);
        ArrayList <Araba> perar3=new ArrayList<>();
        perar3.add(araba1);
        perar3.add(araba2);
        perar3.add(araba3);
        Person person3=new Person("nazım","simsek",
                123456,new Cocuk("azra","sımsek",12,true),perar3);
        System.out.println(person3.toString());
    }
}
