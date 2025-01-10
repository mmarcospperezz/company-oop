package org.ies.company.components;

import org.ies.company.model.Empleado;

import java.util.Scanner;

public class EmpleadoReader {

    private final Scanner scanner;

    public EmpleadoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Empleado read(){
        System.out.println("Datos del empleado");

        System.out.println("NIF:");
        String nif = scanner.nextLine();

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Apellido:");
        String surname = scanner.nextLine();

        System.out.println("Puesto");
        String puesto = scanner.nextLine();

        return new Empleado(
                nif,
                name,
                surname,
                puesto
        );
    }
}
