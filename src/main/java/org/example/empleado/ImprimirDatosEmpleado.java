package org.example.empleado;

public class ImprimirDatosEmpleado {
    private Empleado empleado;
    private Salario salario;

    public ImprimirDatosEmpleado(String empleado, double salario) {
        this.empleado = new Empleado(empleado);
        this.salario = new Salario(salario);
    }

    public void print() {
        System.out.println(empleado.getNombre());
        System.out.println(salario.calcularSalario());
    }
}
