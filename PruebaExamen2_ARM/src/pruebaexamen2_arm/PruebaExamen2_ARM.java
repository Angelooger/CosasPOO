/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2_arm;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaExamen2_ARM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        
        String nombre,apellidoP,apellidoM,direccion,numeroT,usuario,contraseña;
        int nivelP;
        double millasVF;
        String fechaR,horarioR,origenR,destinoR;
        
        ClienteN cN1;
        ClienteP cP1;
        Reservacion rN1;
        Reservacion rP1;
        Reservacion rP2;
        
        System.out.println("Ingresa el nombre del usuario normal:");
        nombre = entradaString.nextLine();
        System.out.println("Ingresa el apellido Paterno del usuario normal:");
        apellidoP = entradaString.nextLine();
        System.out.println("Ingresa el apellido materno del usuario normal:");
        apellidoM = entradaString.nextLine();
        System.out.println("Ingresa la dirección del usuario normal:");
        direccion = entradaString.nextLine();
        System.out.println("Ingresa el numero de tarjeta de credito del usuario normal:");
        numeroT = entradaString.nextLine();
        System.out.println("Ingresa el usuario normal:");
        usuario = entradaString.nextLine();
        System.out.println("Ingresa la contraseña del usuario normal:");
        contraseña = entradaString.nextLine();
        System.out.println("Ingresa la fecha de la reserva del usuario normal:");
        fechaR = entradaString.nextLine();
        System.out.println("Ingresa el horario de la reserva del usuario normal (en horas):");
        horarioR = entradaString.nextLine();
        System.out.println("Ingresa el origen de la reserva del usuario normal:");
        origenR = entradaString.nextLine();
        System.out.println("Ingresa el destino de la reserva del usuario normal:");
        destinoR = entradaString.nextLine();
        rN1=new Reservacion(fechaR,horarioR,origenR,destinoR);
        cN1=new ClienteN(nombre,apellidoP,apellidoM,direccion,numeroT,usuario,contraseña,rN1,rN1);
        
        System.out.println("Ingresa el nombre del usuario premier:");
        nombre = entradaString.nextLine();
        System.out.println("Ingresa el apellido Paterno del usuario premier:");
        apellidoP = entradaString.nextLine();
        System.out.println("Ingresa el apellido materno del usuario premier:");
        apellidoM = entradaString.nextLine();
        System.out.println("Ingresa la dirección del usuario premier:");
        direccion = entradaString.nextLine();
        System.out.println("Ingresa el numero de tarjeta de credito del usuario premier:");
        numeroT = entradaString.nextLine();
        System.out.println("Ingresa el usuario premier:");
        usuario = entradaString.nextLine();
        System.out.println("Ingresa la contraseña del usuario premier:");
        contraseña = entradaString.nextLine();
        System.out.println("Ingresa el nivel premier del usuario:");
        nivelP = entradaInt.nextInt();
        System.out.println("Ingresa el numero de millas de viajero frecuente:");
        millasVF = entradaDouble.nextDouble();
        System.out.println("Ingresa la fecha de la primer reserva del usuario premier:");
        fechaR = entradaString.nextLine();
        System.out.println("Ingresa el horario de la primer reserva del usuario premier (en horas):");
        horarioR = entradaString.nextLine();
        System.out.println("Ingresa el origen de la primer reserva del usuario premier:");
        origenR = entradaString.nextLine();
        System.out.println("Ingresa el destino de la primer reserva del usuario premier:");
        destinoR = entradaString.nextLine();
        rP1=new Reservacion(fechaR,horarioR,origenR,destinoR);
  
        System.out.println("Ingresa la fecha de la segunda reserva del usuario premier:");
        fechaR = entradaString.nextLine();
        System.out.println("Ingresa el horario de la segunda reserva del usuario premier (en horas):");
        horarioR = entradaString.nextLine();
        System.out.println("Ingresa el origen de la segunda reserva del usuario premier:");
        origenR = entradaString.nextLine();
        System.out.println("Ingresa el destino de la segunda reserva del usuario premier:");
        destinoR = entradaString.nextLine();
        
        rP2=new Reservacion(fechaR,horarioR,origenR,destinoR);
        cP1=new ClienteP(nivelP,millasVF,nombre,apellidoP,apellidoM,direccion,numeroT,usuario,contraseña,rP1,rP2);
        System.out.printf("El usuario %s %s %s con direccion %s numero de tarjeta %s con usuario %s y contraseña %s\n",cN1.getNombre(),cN1.getApellidoP(),cN1.getApellidoM(),cN1.getDireccion(),cN1.getNumeroT(),cN1.getUsuario(),cN1.getContraseña());
        System.out.printf("Tiene una reservacion para la fecha %s en un horario %s hrs con origen en %s y con destino en %s\n",cN1.getReservacion1().getFechaR(),cN1.getReservacion1().getHorarioR(),cN1.getReservacion1().getOrigenR(),cN1.getReservacion1().getDestinoR());
        System.out.printf("El ususario %s %s %s con direccion %s numero de tarjeta %s con usuario %s y contraseña %s\n",cP1.getNombre(),cP1.getApellidoP(),cP1.getApellidoM(),cP1.getDireccion(),cP1.getNumeroT(),cP1.getUsuario(),cP1.getContraseña());
        System.out.printf("Con nivel premier de %d y con %.2f millas de viajero frecuente",cP1.getNivelP(),cP1.getMillasVF());
        System.out.printf("tiene una reservacion para la fecha %s en un horario %s hrs con origen en %s y con destino en %s\n",cP1.getReservacion1().getFechaR(),cP1.getReservacion1().getHorarioR(),cP1.getReservacion1().getOrigenR(),cP1.getReservacion1().getDestinoR());
        System.out.printf("Y tiene otra reservacion para la fecha %s en un horario %s hrs con origen en %s y con destino en %s\n",cP1.getReservacion2().getFechaR(),cP1.getReservacion2().getHorarioR(),cP1.getReservacion2().getOrigenR(),cP1.getReservacion2().getDestinoR());
    
    }
    
}
