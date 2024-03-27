package ru.sgu;

public class taskC {
    public static void main(String[] args){
        Car.builder().setName("BMW").setColor("Black").setMaxSpeed(280).build().print();
    }
}
