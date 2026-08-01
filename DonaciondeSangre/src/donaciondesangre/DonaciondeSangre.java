/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 * Objetivos
 * 1.   Estructuras de Seleccion Anidadas
 * 2.   Operaciones booleanos
 *      a. And (&&)
 *      b. Or (||)
 *      c. NOT(!)
 */

public class DonaciondeSangre {

    /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Declaracion de Variables
       Scanner input = new Scanner(System.in);
       int edad = 0;
       int peso = 0;
       boolean comio = true;
       char respuesta = '@';
       int hierro = 0;
       String genero = "Sin valor";
       
       // Solicitar al usuario la edad y peso
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.print("Ingrese su peso: ");
        peso = input.nextInt();

        
        // ADN && (Y)
        /*
        Tabla de verdad
            Criterio 1      Criterio 2      Resultado
            V               V               V
            V               F               F
            F               V               F
            F               F               F
        */
        
        // OR || (O)
        /*
        Tabla de verdad
            Criterio 1      Criterio 2      Resultado
            V               V               V
            V               F               V
            F               V               V
            F               F               F
        */
        
        // NOT ! (Negacion / Opuesto)
        /*
        Tabla de verdad
            Criterio 1      Resultado
            V               F
            F               V
        */   
        
        if (edad >= 18 && edad <= 65 && peso >= 110) {
            input.nextLine();
            System.out.println("ya comio? S=Si , N=No");
            respuesta = input.nextLine().charAt(0);
            if (respuesta == 'S' || respuesta == 's') {
                System.out.println("Si puede donar Sangre");
                comio = true;
            } else {
                System.out.println("Es necesario que comas");
                comio = false;
            }
        } else {
            System.out.println("No puede donar Sangre");
        }

        System.out.print("Ingrese el nivel de hierro en sangre: ");
        hierro = input.nextInt();
        input.nextLine();
        System.out.print("Ingrese su genero, MASCULINO / FEMENINO: ");
        genero = input.nextLine().toUpperCase();

        if (((genero.equals("MASCULINO") && hierro >= 14)) || (genero.equals("FEMENINO") && hierro >= 12)) {
            System.out.println("Si puede Donar");
        } else {
            System.out.println("No puede donar Sangre");
        }
        
        
    }//Fin Main
    
}//Fin Class
