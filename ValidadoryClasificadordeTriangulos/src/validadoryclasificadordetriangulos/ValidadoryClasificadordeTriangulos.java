/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validadoryclasificadordetriangulos;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class ValidadoryClasificadordeTriangulos {

    /**
     * Se le pide al usuario que ingrese las longitudes de los tres lados de un triángulo.
     * Primero, valida si los lados forman un triángulo real: La suma de dos lados cualesquiera 
     * siempre debe ser estrictamente mayor que el tercer lado.
     *      Si no es un triángulo válido, imprime un mensaje de error.
     *      Si es válido usar una estructura de selección para clasificarlo:
     *          A.  Equilátero (los 3 lados iguales).
     *          B.  Isósceles (exactamente 2 lados iguales).
     *          C.  Escaleno (ningún lado igual).     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;

        System.out.print("Ingrese el valor del primer lado: ");
        lado1 = input.nextInt();
        System.out.print("Ingrese el valor del segundo lado: ");
        lado2 = input.nextInt();
        System.out.print("Ingrese el valor del tercer lado: ");
        lado3 = input.nextInt();

        suma1 = lado1 + lado2;
        suma2 = lado2 + lado3;
        suma3 = lado1 + lado3;

        if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
            System.out.println("ERROR!!, No es un triangulo valido");
        } else {
            if (suma1 > lado3 || suma2 > lado1 || suma3 > lado2) {
                System.out.println("Es un triangulo valido");
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("El triangulo es Equilatero");
                } else {
                    if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                        System.out.println("El triangulo es Isosceles");
                    } else {
                        System.out.println("El triangulo es Escaleno");
                    }
                }
            } else {
                System.out.println("ERROR!!, No es un triangulo valido");
            }
        }
        
        
    }//Fin Main

}//Fin Class
