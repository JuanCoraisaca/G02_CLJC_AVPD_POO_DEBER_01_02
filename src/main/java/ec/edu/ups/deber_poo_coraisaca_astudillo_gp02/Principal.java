/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.deber_poo_coraisaca_astudillo_gp02;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Empleado Juan
        var empleado1 = new Empleado();
        empleado1.nombre = "Juan Coraisaca";
        empleado1.horasTrabajadas = 100;
        empleado1.costoHora = 6;
        empleado1.anioIngreso = 2010;
        
  System.out.println("El nombre del empleado es: "+empleado1.nombre);
  System.out.println("");
  System.out.println("Las horas trabajadas son: "+empleado1.horasTrabajadas);
  System.out.println("");
  System.out.println("El costo por hora es : "+empleado1.costoHora);
  System.out.println("");
  System.out.println("El año de ingreso del empleado es: "+empleado1.anioIngreso);
  System.out.println("");
  System.out.println("Los ingresos totales del trabajador es de: "+empleado1.calcularIngreso(2022));
  System.out.println("");
  System.out.println("El bono extra es de: "+empleado1.calcularHoraBonusExtra(150));
  System.out.println("");
  System.out.println("Los impuestos son: "+empleado1.calcularImpuestos(500, 1000, 2000));
  
  
   //Empleado Pedro 
        var empleado2 = new Empleado();
        empleado2.nombre = "Pedro Astudillo";
        empleado2.horasTrabajadas = 200;
        empleado2.costoHora = 5;
        empleado2.anioIngreso = 2020;
        
  System.out.println("El nombre del empleado es: "+empleado2.nombre);
  System.out.println("");
  System.out.println("Las horas trabajadas son: "+empleado2.horasTrabajadas);
  System.out.println("");
  System.out.println("El costo por hora es : "+empleado2.costoHora);
  System.out.println("");
  System.out.println("El año de ingreso del empleado es: "+empleado2.anioIngreso);
  System.out.println("");
  System.out.println("Los ingresos totales del trabajador es de: "+empleado2.calcularIngreso(2022));
  System.out.println("");
  System.out.println("El bono extra es de: "+empleado2.calcularHoraBonusExtra(150));
  System.out.println("");
  System.out.println("Los impuestos son: "+empleado2.calcularImpuestos(500, 1000, 2000));
  
  
   //Empleado Sergio 
        var empleado3 = new Empleado();
        empleado3.nombre = "Sergio Sacoto";
        empleado3.horasTrabajadas = 150;
        empleado3.costoHora = 8;
        empleado3.anioIngreso = 2018;
        
  System.out.println("El nombre del empleado es: "+empleado3.nombre);
  System.out.println("");
  System.out.println("Las horas trabajadas son: "+empleado3.horasTrabajadas);
  System.out.println("");
  System.out.println("El costo por hora es : "+empleado3.costoHora);
  System.out.println("");
  System.out.println("El año de ingreso del empleado es: "+empleado3.anioIngreso);
  System.out.println("");
  System.out.println("Los ingresos totales del trabajador es de: "+empleado3.calcularIngreso(2022));
  System.out.println("");
  System.out.println("El bono extra es de: "+empleado3.calcularHoraBonusExtra(150));
  System.out.println("");
  System.out.println("Los impuestos son: "+empleado3.calcularImpuestos(500, 1000, 2000));
              
    }
}
    
    

