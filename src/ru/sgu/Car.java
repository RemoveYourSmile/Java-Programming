package ru.sgu;

public class Car {
    private final String name;
    private final String color;
    private final int maxSpeed;
    private final int weight;

    public Car(String name, String color, int maxSpeed, int weight) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public static carBuilder builder(){
        return new carBuilder();
    }

    public void print(){
        System.out.println("Car: " + name + " " + color + " " + maxSpeed + " " + weight);
    }

    public static class carBuilder{
        private String name;
        private String color = "White";
        private int maxSpeed = 260;
        private int weight = 1600;

        public carBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public carBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public carBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public carBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Car build(){
            return new Car(name, color, maxSpeed, weight);
        }
    }
}
