package org.example.car;

public class Car {
    private Engine engine;
    public Car(String engineType) {
        this.engine = new Engine(engineType);
    }
    public void startCar() {
        System.out.println("Encendiendo carro...");
        engine.start();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
