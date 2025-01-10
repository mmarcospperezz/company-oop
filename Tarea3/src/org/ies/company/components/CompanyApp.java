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

    public void run() {
        Empresa empresa = empresaReader.read();
    }
}
