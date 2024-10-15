package org.example.empleado;

public class Salario {
    private double salario;
    public Salario(double salario) {
        this.salario = salario;

    }
    public double getSalario() {
        return salario;
    }
    public double calcularSalario() {
        return salario * 0.80;
    }

}
