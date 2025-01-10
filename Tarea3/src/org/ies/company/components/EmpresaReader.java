package org.ies.company.components;

import org.ies.company.model.Departamento;
import org.ies.company.model.Empleado;
import org.ies.company.model.Empresa;

import java.util.Objects;
import java.util.Scanner;

public class EmpresaReader {
    private final Scanner scanner;
    private final DepartamentoReader departamentoReader;

    public EmpresaReader(Scanner scanner, DepartamentoReader departamentoReader) {
        this.scanner = scanner;
        this.departamentoReader = departamentoReader;
    }

    public Empresa read() {
        System.out.println("Datos de la empresa");

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        System.out.println("CIF:");
        String cif = scanner.nextLine();

        System.out.println("¿Cuantos departamentos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Departamento[] departamentos = new Departamento[size];
        for (int i = 0; i < size; i++) {
            departamentos[i] = departamentoReader.read();
        }

        return new Empresa(
                nombre,
                cif,
                departamentos

        );
    }
}
