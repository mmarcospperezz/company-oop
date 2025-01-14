package org.ies.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Empresa {
    private String nombre;
    private String cif;
    private Departamento[] departamentos;

    public Empresa(String nombre, String cif, Departamento[] departamentos) {
        this.nombre = nombre;
        this.cif = cif;
        this.departamentos = departamentos;
    }

    private Departamento buscarDepartamento (String nombre) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombre)) {
                return departamento;
            }
        } return null;
    }

    public void showInfoNombreDepartamento(String name) {
        Departamento departamento = buscarDepartamento(name);
        if (departamento != null) {
            System.out.println("Nombre: " + departamento.getNombre());
            System.out.println("Presupuesto: " + departamento.getPresupuesto());
            System.out.println("Empleados: ");
            System.out.println();
            departamento.showInfoEmpleado();
            System.out.println();
        } else {
            System.out.println("Error, no se encuentra el departamento");
        }
    }

    public void showEmpleadoDepartmentoNif(String name, String nif) {
        Departamento departmento = buscarDepartamento(name);
        if (departmento != null) {
            var employee = departmento.findEmpleadoNif(nif);
            if (employee != null) {
                System.out.println("Empleado");
                employee.showInfo();
            } else {
                System.out.println("No se encuentra el empleado en el departamento");
            }
        } else {
            System.out.println("No existe el departamento");
        }
    }

    public void showEmpleadoDepartamentoNombre(String name) {
        Departamento departmento = buscarDepartamento(name);
        if (departmento != null) {
            System.out.println("Empleados: ");
            System.out.println();
            departmento.showInfoEmpleado();
        } else {
            System.out.println("Error, no se encuentra el departamento");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre) && Objects.equals(cif, empresa.cif) && Objects.deepEquals(departamentos, empresa.departamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cif, Arrays.hashCode(departamentos));
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}