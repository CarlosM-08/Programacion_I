/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisioncuentarestaurante_ejercicioadicional;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class DivisionCuentaRestaurante_EjercicioAdicional {

    //División de cuenta de restaurante
    /*  Escriba un programa que pida al usuario el monto total de una cuenta 
        de restaurante y la cantidad de personas en la mesa. Calcule y muestre en 
        pantalla cuánto dinero debe pagar cada persona si deciden dividir la cuenta 
        en partes exactamente iguales.    
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        double montototal = 0;
        int personas = 0;
        double totalpagar = 0;

        System.out.print("Ingrese el monto total de la factura: ");
        montototal = teclado.nextDouble();
        System.out.print("Ingrese la cantidad de personas: ");
        personas = teclado.nextInt();

        totalpagar = montototal / personas;

        System.out.printf("La cantidad a pagar por persona es: %.2f\n", totalpagar);

    }//Fin Main

}//Fin Class
