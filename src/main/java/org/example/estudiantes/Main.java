package org.example.estudiantes;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudentId("zS23014061");
        classroom.addStudentId("zS23014062");
        classroom.addStudentId("zS23014063");
        classroom.addStudentId("zS23014064");
        classroom.addStudentId("zS23014065");
        classroom.addStudentId("zS23014066");
        classroom.addStudentId("zS23014067");
        System.out.println("Lista de estudiantes");
        classroom.displayStudentsIds();
    }
}
