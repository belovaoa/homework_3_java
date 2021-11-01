package com.github.belovaoa;

import java.sql.SQLOutput;

public class LessonJavaOne {

    boolean aBoolean = true;
    // или boolean aBoolean = false

    char aChar = '&';

    byte aByte = 1;
    short aShort = 1;
    int anInt = 1;
    long aLong = 1;

    float aFloat = 1.0F;
    double aDouble = 1.0D;

    static class Human {
        int age;
        int weight;
        String name;

        public void sayName() {
            System.out.println(name);
        }

        public void sayAge() {
            System.out.println(age);
        }

        public void incrementAge() {
          age = age + 1;
        }

    }

    public static void main(String[] args) {
       // String message = "HelloWorld!";
        int age = 10;
        Human dima  = new Human();
        // human.alex - ссылка на место в памяти, где хранится этот объект
        Human alex  = new Human();
        dima.name = "Дима";
        dima.age = Integer.parseInt("32");
        dima.weight = Integer.parseInt("70");
        alex.name = "Александр";
        alex.age = Integer.parseInt("32");
        dima.sayName();
        alex.sayName();
        dima.incrementAge();
        dima.sayAge();
        alex.sayAge();


       // System.out.println(dima.name);
       // System.out.println(dima.age);
       // System.out.println(dima.weight);

        // System.out.println(message);
    }
}
