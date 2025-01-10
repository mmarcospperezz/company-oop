package org.ies.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombre;
    private double presupuesto;
    private Empleado[] empleados;

    public Departamento(String nombre, double presupuesto, Empleado[] empleados) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.empleados = empleados;
    }

    public void showInfo() {
        System.out.println("Datos del departamento:" + nombre + presupuesto + empleados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Double.compare(presupuesto, that.presupuesto) == 0 && Objects.equals(nombre, that.nombre) && Objects.deepEquals(empleados, that.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, presupuesto, Arrays.hashCode(empleados));
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", presupuesto=" + presupuesto +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}
