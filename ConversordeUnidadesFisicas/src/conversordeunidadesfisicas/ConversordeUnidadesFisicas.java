/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordeunidadesfisicas;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class ConversordeUnidadesFisicas {

    /**
     * Conversor de Unidades Físicas (Uso Do-while) 
     * Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. 
     * El menú debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 
     * 3) Centímetros a Pulgadas, y 4) Salir.
     *      • Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca 
     *        pueden ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse 
     *        un mensaje de error y volver a pedir el dato.
     *      • Operación: Utiliza una estructura switch para procesar la opción elegida y realizar
     *        la operación aritmética correspondiente. El menú debe repetirse usando do-while hasta 
     *        que el usuario elija la opción 4.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        int seleccion = 0;
        double metros = 0, kilogramos = 0, centimetros = 0, pies = 0, libras = 0, pulgadas = 0;

        do {
            System.out.println("=====CONVERSION DE MEDIDAS DE LONGITUD Y PESO=====");
            System.out.println("""
                               Menu
                               ----
                               1. Metros a Pies
                               2. Kilogramos a Libras
                               3. Centimetros a Pulgadas
                               4. Salir                               
                               """);

            System.out.print("Ingrese su respuesta: ");
            seleccion = input.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("");
                    System.out.println("===Conversion de metros a pies===");
                    System.out.print("Ingrese la cantidad de metros: ");
                    metros = input.nextDouble();
                    while (metros < 0) {
                        System.out.println("El dato ingresado debe ser mayor que cero");
                        System.out.print("Ingrese la cantidad de metros: ");
                        metros = input.nextDouble();
                    }
                    pies = metros * 3.28;
                    System.out.printf("%.2f metros equivale a %.2f pies\n", metros, pies);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("===Conversion de kilogramos a libras===");
                    System.out.print("Ingrese la cantidad de kilogramos: ");
                    kilogramos = input.nextDouble();
                    while (kilogramos < 0) {
                        System.out.println("El dato ingresado debe ser mayor que cero");
                        System.out.print("Ingrese la cantidad de kilogramos: ");
                        kilogramos = input.nextDouble();
                    }
                    libras = kilogramos / 0.454;
                    System.out.printf("%.2f kilogramos equivale a %.2f libras\n", kilogramos, libras);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("===Conversion de centimetros a pulgadas===");
                    System.out.print("Ingrese la cantidad de centimetros: ");
                    centimetros = input.nextDouble();
                    while (centimetros < 0) {
                        System.out.println("El dato ingresado debe ser mayor que cero");
                        System.out.print("Ingrese la cantidad de centimetros: ");
                        centimetros = input.nextDouble();
                    }
                    pulgadas = centimetros * 0.394;
                    System.out.printf("%.2f centimetros equivale a %.2f pulgadas\n", centimetros, pulgadas);
                    System.out.println("");
                    break;
                default:
                    break;
            }//Fin switch

        } while (seleccion != 4);
        System.out.println("El programa ha finalizado");

    }//Fin Main

}//FIna Class
