package org.example.empleado;

public class Main {
    public static void main(String[] args) {
        ImprimirDatosEmpleado empleado = new ImprimirDatosEmpleado("Saul" , 20000);
        empleado.print();
    }
}
