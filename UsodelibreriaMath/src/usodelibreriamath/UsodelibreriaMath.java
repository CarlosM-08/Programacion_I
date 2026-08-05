/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelibreriamath;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class UsodelibreriaMath {
    
    // Uso de la librería Math 
    /*  Desarrolle un programa que pida al usuario el radio de un círculo.
        Utilizando la constante Math.PI y la función Math.pow() de la librería 
        matemática de Java, calcule el área y circunferencia de dicho círculo 
        y muestre el resultado al usuario.
    */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        double radiocirculo = 0;
        double valorPi = Math.PI;
        double area = 0;
        double circunferencia = 0;

        System.out.print("Ingrese el valor del radio: ");
        radiocirculo = teclado.nextDouble();

        area = valorPi * Math.pow(radiocirculo, 2);
        circunferencia = 2 * valorPi * radiocirculo;

        System.out.printf("El area del circulo es: %.2f.\n", area);
        System.out.printf("La circunferencia del circulo es: %.2f\n", circunferencia);

    }//Fin main

}//Fin Class
