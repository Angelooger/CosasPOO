/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacd;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido,fechaNacimiento,calle,numero,delomun,cp,estado,nombredir;
        Direccion d1,d2,d3;
        Cliente c1;
        
        System.out.println("Dame el nombre del cliente ");
        nombre = entrada.next();
        System.out.println("Dame el apellido del cliente ");
        apellido = entrada.next();
        System.out.println("Dame la fecha de nacimiento del cliente ");
        fechaNacimiento = entrada.next();
            System.out.println("Dame la calle");
            calle = entrada.next();
            System.out.println("Dame el numero ");
            numero = entrada.next();
            System.out.println("Dame la delegación o municipio ");
            delomun = entrada.next();
            System.out.println("Dame lel código postal ");
            cp = entrada.next();
            System.out.println("Dame el estado ");
            estado = entrada.next();
            System.out.println("Dame el nombre de la dirección ");
            nombredir = entrada.next();
            
            d1=new Direccion(calle, numero, delomun,cp,estado,nombredir);
            
            System.out.println("Dame la calle");
            calle = entrada.next();
            System.out.println("Dame el numero ");
            numero = entrada.next();
            System.out.println("Dame la delegación o municipio ");
            delomun = entrada.next();
            System.out.println("Dame lel código postal ");
            cp = entrada.next();
            System.out.println("Dame el estado ");
            estado = entrada.next();
            System.out.println("Dame el nombre de la dirección ");
            nombredir = entrada.next();
            
            d2=new Direccion(calle, numero, delomun,cp,estado,nombredir);
            
            System.out.println("Dame la calle");
            calle = entrada.next();
            System.out.println("Dame el numero ");
            numero = entrada.next();
            System.out.println("Dame la delegación o municipio ");
            delomun = entrada.next();
            System.out.println("Dame lel código postal ");
            cp = entrada.next();
            System.out.println("Dame el estado ");
            estado = entrada.next();
            System.out.println("Dame el nombre de la dirección ");
            nombredir = entrada.next();
                    
            c1=new Cliente(nombre,apellido,fechaNacimiento,0,d1,d2,new Direccion(calle, numero, delomun,cp,estado,nombredir));
            System.out.println("Bienvenido Sra./Sr "+c1.getNombre());
            System.out.println("Calle 2: "+c1.getDireccion2().getCalle());
    }
}
