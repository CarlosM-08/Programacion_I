/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocondosvariables;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class CalculoConDosVariables {

    // Cálculo con dos variables 
    /*  Escribir un programa que solicite al usuario la base y la altura 
        de un rectángulo. Utilice estas dos variables para calcular el área 
        del rectángulo (Base X Altura) y el perímetro (suma de todos sus lados). 
        Imprimir ambos resultados en pantalla. 
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        double base = 0;
        double altura = 0;
        double arearectangulo = 0;
        double perimetro = 0;

        System.out.print("Ingrese la base del rectangulo: ");
        base = teclado.nextDouble();
        System.out.print("ingrese la altura del rectangulo: ");
        altura = teclado.nextDouble();

        arearectangulo = base * altura;
        perimetro = (2 * base) + (2 * altura);

        System.out.printf("El area del rectangulo es: %.2f\n", arearectangulo);
        System.out.printf("El perimetro del rectangulo es: %.2f\n", perimetro);
    }

}
