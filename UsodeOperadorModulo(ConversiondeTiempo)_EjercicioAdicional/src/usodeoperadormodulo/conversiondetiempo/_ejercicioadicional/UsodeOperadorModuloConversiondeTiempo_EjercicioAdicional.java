/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodeoperadormodulo.conversiondetiempo._ejercicioadicional;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class UsodeOperadorModuloConversiondeTiempo_EjercicioAdicional {

    // Uso del operador módulo (Conversión de tiempo)
    /*  Escriba un programa que solicite una cantidad de tiempo expresada 
        en minutos (por ejemplo, 135 minutos). Utilizando el operador de 
        división (/) y el operador de módulo (%), calcule y muestre a cuántas 
        horas y minutos exactos equivale esa cantidad.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        int tiempo = 0;
        int horas = 0;
        int minutos = 0;

        System.out.print("Ingrese el tiempo que desea convertir (en minutos): ");
        tiempo = teclado.nextInt();

        horas = tiempo / 60;
        minutos = tiempo % 60;

        System.out.printf("El tiempo ingresado corresponde a %d Horas y %d Minutos\n", horas, minutos);

    }//Fin Main

}//Fin Class
