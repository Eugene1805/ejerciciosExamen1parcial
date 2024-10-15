package org.example.car;

public class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;
    }
    public String getType() {
            return type;
    }
    public void start() {
        System.out.println("motor" + type + "encendido");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
