package org.ies.company.components;

import org.ies.company.model.Departamento;
import org.ies.company.model.Empleado;

import java.util.Scanner;

public class DepartamentoReader {
    private final Scanner scanner;
    private final EmpleadoReader empleadoReader;

    public DepartamentoReader(Scanner scanner, EmpleadoReader empleadoReader) {
        this.scanner = scanner;
        this.empleadoReader = empleadoReader;
    }

    public Departamento read() {
        System.out.println("Datos del departamento");

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Presupuesto:");
        Double presupuesto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("¿Cuantos empleados hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Empleado[] empleados = new Empleado[size];
        for (int i = 0; i < size; i++) {
            empleados[i] = empleadoReader.read();
        }

        return new Departamento(
                nombre,
                presupuesto,
                empleados

        );
    }
    }

