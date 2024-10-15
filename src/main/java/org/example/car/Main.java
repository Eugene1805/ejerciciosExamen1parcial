package org.example.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V8");
        System.out.println(car);
        System.out.println("La relacion es una composicion porque al crear un auto se debe crear un motor");
    }
}