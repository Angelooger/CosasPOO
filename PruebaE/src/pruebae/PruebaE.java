/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebae;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        EmpleadoComision e1;
        EmpleadoBaseComision e2;
        String  nombre,apellido,nss;
        double ventas,porcentaje,sueldob;
        System.out.println("Ingresa Nombre ");
        nombre=entrada.next();
        System.out.println("Ingresa Apellido ");
        apellido=entrada.next();
        System.out.println("Ingresa NSS ");
        nss=entrada.next();
        System.out.println("Ingresa las Ventas Brutas ");
        ventas=entrada.nextDouble();
        System.out.println("Ingresa porcentaje de comision ");
        porcentaje=entrada.nextDouble();
        System.out.println("Ingresa sueldo base ");
        sueldob=entrada.nextDouble();
        
        e1=new EmpleadoComision(nombre,apellido,nss,ventas,porcentaje);
        e2=new EmpleadoBaseComision(sueldob,nombre,apellido,nss,ventas,porcentaje);
        
        e1.calcularIngreso();
        e2.calcularIngreso();
        
        System.out.printf("%s ganaría %n%.1f solo de comisiones%n",e1.getNombreEC(),e1.getIngreso());
        System.out.printf("%s ganaría %n%.1f con comisiones y sueldo base%n",e2.getNombreEC(),e2.getIngreso());
        
    }
    
}