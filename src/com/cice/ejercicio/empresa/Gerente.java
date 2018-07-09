package com.cice.ejercicio.empresa;

public class Gerente extends Empleado{

    private String departamento;


    public Gerente(double salario, String nombre, String fechaNacimiento, String departamento) {
        super(salario, nombre, fechaNacimiento);
        this.departamento = departamento;
        this.incrementarSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    protected void incrementarSalario(){
        this.setSalario(this.getSalario()*1.05);
    }

    /*public void incrementarSalarioB(double salario){
        this.setSalario(salario*1.05);
    }

    public double incrementarSalarioC(double salario){
        return salario * 0.05;
        //devuelve el incremento
    }
    public double salarioIncrementadoOpcionD(double salario){
        return salario * 1.05;
        //devuevle el salario incrementado
    }*/

}
