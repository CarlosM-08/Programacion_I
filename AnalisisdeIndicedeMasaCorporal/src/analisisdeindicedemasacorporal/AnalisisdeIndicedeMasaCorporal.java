/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisdeindicedemasacorporal;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class AnalisisdeIndicedeMasaCorporal {

    /**
     * Análisis de Índice de Masa Corporal
     * Solicitar el nombre del paciente, su peso en kilogramos y su altura en metro.
     *      Primero, verifica que el peso y la altura sean valores lógicos, Si no, muestra "Datos inválidos".
     *          Si son válidos, calcula el IMC: IMC = peso / (altura * altura).
     *      Para imprimir el diagnóstico:
     *          o Menor a 18.5: "Bajo peso" 
     *          o Entre 18.5 y 24.9: "Normal"
     *          o Entre 25.0 y 29.9: "Sobrepeso"
     *          o 30.0 o más: "Obesidad"
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        String nombre = "Sinnombre";
        double peso = 0;
        double altura = 0;
        double IMC = 0;
        boolean datoValidoMin = false;
        boolean datoValidoMax = false;

        System.out.print("Ingrese el nombre del paciente: ");
        nombre = input.nextLine();
        System.out.print("Ingrese el peso del paciente (en kilogramos): ");
        peso = input.nextDouble();
        System.out.print("Ingrese la altura del paciente (en metros): ");
        altura = input.nextDouble();

        datoValidoMin = peso > 2 && altura > 0.40;
        datoValidoMax = peso < 250 && altura < 2.75;

        if (datoValidoMin && datoValidoMax == true) {
            IMC = peso / (altura * altura);
            if (IMC < 18.5) {
                System.out.printf("El indice de masa corporal de %s es %.1f, resultado: Bajo Peso\n", nombre, IMC);
            } else {
                if (IMC >= 18.5 && IMC <= 24.9) {
                    System.out.printf("El indice de masa corporal de %s es %.1f, resultado: Peso Normal\n", nombre, IMC);
                } else {
                    if (IMC > 24.9 && IMC <= 29.9) {
                        System.out.printf("El indice de masa corporal de %s es %.1f, resultado: Sobre Peso\n", nombre, IMC);
                    } else {
                        System.out.printf("El indice de masa corporal de %s es %.1f, resultado: Obesidad\n", nombre, IMC);
                    }
                }
            }
        } else {
            System.out.println("Datos invalidos");
        }//Fin if/else dato valido        

    }//Fin Main

}//FinClass
