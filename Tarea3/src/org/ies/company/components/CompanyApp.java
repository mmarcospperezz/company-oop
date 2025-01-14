package org.ies.company.components;

import org.ies.company.model.Empresa;

import java.util.Scanner;

public class CompanyApp {

    private final Scanner scanner;
    private final EmpresaReader empresaReader;

    public CompanyApp(Scanner scanner, EmpresaReader empresaReader) {
        this.scanner = scanner;
        this.empresaReader = empresaReader;
    }

        public int chooseOption(){
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Elige una opcion:");
            System.out.println("1. Mostrar departamentos por nombre");
            System.out.println("2. Mostrar los empleados por nombre de departamento");
            System.out.println("3. Mostrar el empleado por nombre de departamento y NIF");
            System.out.println("4. Salir");
            return option;
        }
        public void run(){
            int option;
            Empresa empresa = empresaReader.read();
            do {
                option = chooseOption();
                if (option == 1){
                    System.out.println("Introduce el nombre del departamento");
                    String name = scanner.nextLine();
                    empresa.showInfoNombreDepartamento(name);
                } else if (option == 2) {
                    System.out.println("Introduce el nombre del departamento");
                    String name = scanner.nextLine();
                    empresa.showEmpleadoDepartamentoNombre(name);
                } else if (option == 3) {
                    System.out.println("Introduce el nombre del departamento");
                    String name = scanner.nextLine();
                    System.out.println("Introduce el NIF del empleado");
                    String nif = scanner.nextLine();
                    empresa.showEmpleadoDepartmentoNif(name,nif);
                } else if (option == 4) {
                    System.out.println("Saliendo...");
                } else {
                    System.out.println("Opcion invalida");
                }
            } while (option != 4);
        }
    }

