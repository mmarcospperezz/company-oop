import org.ies.company.components.CompanyApp;
import org.ies.company.components.DepartamentoReader;
import org.ies.company.components.EmpleadoReader;
import org.ies.company.components.EmpresaReader;
import org.ies.company.model.Empresa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpleadoReader empleadoReader = new EmpleadoReader(scanner);
        DepartamentoReader departamentoReader = new DepartamentoReader(scanner, empleadoReader);
        EmpresaReader empresaReader = new EmpresaReader(scanner, departamentoReader);
        CompanyApp companyApp = new CompanyApp(scanner, empresaReader);

        companyApp.run();

    }
}