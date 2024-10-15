package org.example.estudiantes;

import java.util.*;

public class Classroom {
    private Set<String> studentIds;

    public Classroom(){ studentIds = new HashSet<>();  }

    public void addStudentId(String id) {
        if (studentIds.add(id)) {
            System.out.println("Estudiante ID " + id + " agregado.");
        } else {
            System.out.println("Estudiante ID " + id + " ya existe");
        }
    }
    public void displayStudentsIds() {
        Iterator<String> it = studentIds.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
