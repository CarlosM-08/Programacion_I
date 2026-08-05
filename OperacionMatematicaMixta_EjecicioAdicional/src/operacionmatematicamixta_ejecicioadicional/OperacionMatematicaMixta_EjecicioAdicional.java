/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionmatematicamixta_ejecicioadicional;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class OperacionMatematicaMixta_EjecicioAdicional {

    //Operación matemática mixta
    /*  Escribir un programa para convertir temperaturas. El programa debe 
        solicitar al usuario que ingrese una temperatura en grados Fahrenheit. 
        Luego, aplique la fórmula matemática mixta (Fahrenheit - 32) * 5 / 9 para 
        convertir el valor a grados Celsius y muestre el resultado final.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        double gradosfahrenheith = 0;
        double gradoscelsius = 0;

        System.out.print("Ingrese los grados Fahreinheith a convertir: ");
        gradosfahrenheith = teclado.nextDouble();

        gradoscelsius = ((gradosfahrenheith - 32) * 5) / 9;

        System.out.printf("%.2f grados Fahrenheith es igual a: %.2f grados Celsius\n", gradosfahrenheith, gradoscelsius);

    }//Fin Main

}//Fin Class
