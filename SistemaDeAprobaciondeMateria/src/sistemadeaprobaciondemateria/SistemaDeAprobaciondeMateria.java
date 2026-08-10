/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobaciondemateria;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class SistemaDeAprobaciondeMateria {

    /** Sistema de Aprobación de Materia    
     */
     
    /*  Se tiene que escribir un programa que solicite al usuario el nombre
        del estudiante (tipo string) y las calificaciones obtenidas en dos exámenes
        parciales (tipo double). El programa debe calcular el promedio final. 
        Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando 
        que el estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
        Requisito estricto: Solo puedes usar una estructura if/else simple.
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Declaracion de variables
        
        String nombreest = "SinNombre";
        double nota1 = 0;
        double nota2 = 0;
        double promedio = 0;
        
        System.out.print("Ingrese el nombre del estudiante: ");
        nombreest = input.nextLine();
        
        System.out.print("Ingrese la nota 1: ");
        nota1 = input.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        nota2 = input.nextDouble();
        
        promedio = (nota1 + nota2) / 2;
        
        if(promedio >= 65){
            System.out.println("El estudiante esta APROBADO!!");
        }//Fin del if
        
        else{
            System.out.println("El estudiante esta REPROBADO!!");        
        }
    }//Fin Main
    
}//Fin Class
