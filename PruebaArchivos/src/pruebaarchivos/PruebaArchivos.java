/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarchivos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Escriba el nombre de lo que quiere buscar");
        Path ruta= Paths.get(entrada.nextLine());
        
        if(Files.exists(ruta)){
            System.out.printf("%n%s existe%n",ruta.getFileName());
            System.out.printf("%s un directorio%n",Files.isDirectory(ruta)? "Es": "No es");
            System.out.printf("%s una ruta absoluta%n", ruta.isAbsolute() ? "Es":"No es");
            System.out.printf("Fecha de ultima modificacion: %s%n",Files.getLastModifiedTime(ruta));
            System.out.printf("Tamanio: %s%n",Files.size(ruta));
            System.out.printf("Ruta: %s%n",ruta);
            System.out.printf("Ruta Absoluta: %s%n",ruta.toAbsolutePath());
        }
        if(Files.isDirectory(ruta)){
            System.out.printf("%n Contenido del directorio: %n");
            DirectoryStream<Path> flujoDirectorio=Files.newDirectoryStream(ruta);
            for (Path p : flujoDirectorio)
                System.out.println(p);
        }
        else{
            System.out.printf("%s no existe%n",ruta);
        }
    }
    
}
