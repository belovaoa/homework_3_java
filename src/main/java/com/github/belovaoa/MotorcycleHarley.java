package com.github.belovaoa;

public class MotorcycleHarley {

    static class moto {

        private String name;
        private String colour;
        private int price;

        public void sayName() {
            System.out.println(name);
        }

        public void sayColour() {
            System.out.println(colour);
        }

        public void sayPrice() {
            System.out.println(price);
        }

        public void changePrice() {
            price = price + 200000;
        }
    }


    public static void main(String[] args) {

        moto harley = new moto();
        System.out.println("Я купил сегодня: ");
        harley.name = "HarleyDavidson";
        harley.sayName();
        System.out.println("Его цвет: ");
        harley.colour = "white";
        harley.sayColour();
        harley.price = 1000000;
        System.out.println("Его цена:");
        harley.sayPrice();
        System.out.println("Через год он будет стоить: ");
        harley.changePrice();
        harley.sayPrice();
    }

}
