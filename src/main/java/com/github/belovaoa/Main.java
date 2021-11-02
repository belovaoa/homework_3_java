package com.github.belovaoa;

public class Main {

    static class Woman {

        String name;
        int age;

        public void sayName() {
            System.out.println(name);
        }

        public void sayAge() {
            System.out.println(age);
        }

        public void applyCream() {
            age = age - 2;
        }
    }

    public static void main(String[] args){

        Woman galya = new Woman();
        System.out.println("На приеме косметолога сегодня:");
        galya.name = "Galina";
        galya.sayName();
        System.out.println("Ее возраст:");
        galya.age = Integer.parseInt("25");
        galya.sayAge();
        System.out.println("После нанесения омолаживающего крема пациент выглядит на:");
        galya.applyCream();
        galya.sayAge();

    }
}

