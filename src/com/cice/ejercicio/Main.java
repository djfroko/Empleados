package com.cice.ejercicio;

import com.cice.ejercicio.empresa.Director;
import com.cice.ejercicio.empresa.Empleado;
import com.cice.ejercicio.empresa.Gerente;

public class Main {

    public static void main(String[] args) {



        Empleado empleado = new Empleado(1000,"Gustavo","03/05/1981");

        Empleado gerente = new Gerente(1000,"Gustavo","03/05/1981","TIC");

        Director director = new Director(1000,"Gustavo","03/05/1981","TIC","1234HCS");

        Empleado[] empleados = {empleado, gerente, director};

        for (Empleado emp : empleados){
            System.out.println(emp.getNombre()+ " " + +emp.getSalario());
        }



        System.out.println(empleado.getSalario());
        System.out.println(gerente.getSalario());
        System.out.println(director.getSalario());


        }

    }

