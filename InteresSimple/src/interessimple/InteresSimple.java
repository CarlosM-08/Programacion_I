/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class InteresSimple {

    // Interés simple 
    /*  Escriba un programa que calcule el interés simple de un préstamo. 
        El sistema debe solicitar el capital inicial, la tasa de interés anual 
        (en formato de número entero) y el tiempo en años. Aplique la fórmula 
        (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        double capital = 0;
        int tasa = 0;
        int tiempo = 0;
        double interessimple = 0;

        System.out.print("Ingrese el valor del capital: ");
        capital = teclado.nextDouble();
        System.out.print("Ingrese el tasa de interes (valor entero): ");
        tasa = teclado.nextInt();
        System.out.print("Ingrese el tiempo del prestamo (en anios): ");
        tiempo = teclado.nextInt();

        interessimple = (capital * tasa * tiempo) / 100;

        System.out.printf("El interes simple, calculado a una tasa del %d%% es: %.2f\n", tasa, interessimple);

    }//Fin Main

}//Fin Class
