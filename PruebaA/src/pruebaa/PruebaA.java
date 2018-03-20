/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaa;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaString=new Scanner(System.in);
        Scanner entradaint=new Scanner(System.in);
        Scanner entradadouble=new Scanner(System.in);
        String nomb, ap;
        int edad;
        double promedio;
        Alumno A1,A2;
        System.out.println("Alumno 1:");
        System.out.println("Dame el nombre: ");
        nomb=entradaString.nextLine();
        System.out.println("Dame el apellido: ");
        ap=entradaString.nextLine();
        System.out.println("Dame la edad: ");
        edad=entradaint.nextInt();
        System.out.println("Dame el promedio: ");
        promedio=entradadouble.nextDouble();
        A1=new Alumno(nomb,ap,edad,promedio);
        new Alumno(nomb,ap,edad,promedio);
        A2=new Alumno(nomb,ap,edad,promedio);
        System.out.printf("El alumno %s %s con identificador %d tiene %d años y un promedio %.2f\n",A1.getNombre(),A1.getApellido(),A1.getId(),A1.getEdad(),A1.getPromedio());
        System.out.printf("El alumno Angel %s con identificador %d tiene %d años y un promedio %.2f\n",A2.getApellido(),A2.getId(),A2.getEdad(),A2.getPromedio());
        System.out.printf("El numero de alumnos es: %d\n",Alumno.contador);
    }
    
}
