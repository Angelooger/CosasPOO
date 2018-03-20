/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaca;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaCa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double P,R,N,T;
        int val;
        String clienteNombre, clienteApellido;
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("Dame el nombre del cliente ");
            clienteNombre=entrada.next();
            System.out.println("Dame el apellido del cliente ");
            clienteApellido=entrada.next();
            System.out.println("Dame la cantidad inicial de dinero para abrir la cuenta de ahorro ");
            P=entrada.nextDouble();
            System.out.println("Dame la tasa de interés ");
            R=(entrada.nextDouble()/100);
            System.out.println("Dame el número de veces al año que se aplicará el interés ");
            N=entrada.nextDouble();
            System.out.println("Dame el número de años");
            T=entrada.nextDouble();
            val=CuentaAhorro.ValidarDatos(P, R, N, T);
            
        }while(val==0);
        
        CuentaAhorro obj1;
        obj1 = new CuentaAhorro(P, R, N, T,clienteNombre,clienteApellido);
        obj1.CalcularImpuesto();
        System.out.println("La proyección de "+obj1.getClienteNombre()+" "+obj1.getClienteApellido()+" utilizando la formula del interés compuesto es de:");
        System.out.println(obj1.getDineroA());
    }
}
