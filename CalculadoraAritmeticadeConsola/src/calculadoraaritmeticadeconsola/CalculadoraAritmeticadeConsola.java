/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmeticadeconsola;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class CalculadoraAritmeticadeConsola {

    /**
     * Calculadora Aritmética de Consola
     * Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario 
     * dos números enteros y un carácter (char) que represente la operación a realizar:
     *  a. Suma 
     *  b. Resta 
     *  c. División 
     *  d. Multiplicación
     *  e. Módulo ‘%
     * 
     * Dependiendo del carácter ingresado, el programa debe usar una estructura de selección 
     * para realizar la operación aritmética correspondiente y mostrar el resultado en formato 
     * decimal (cuidar las divisiones entre cero). Si el usuario ingresa un carácter no válido, 
     * se debe mostrar "Operador no reconocido".
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Declaracion de variable
        int numero1 = 0;
        int numero2 = 0;
        char caracter = '@';
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int modulo = 0;
        double division = 0;

        System.out.print("Ingrese el valor del primer numero: ");
        numero1 = input.nextInt();
        System.out.print("Ingrese el valor del segundo numero: ");
        numero2 = input.nextInt();

        System.out.println("""
                           Ingrese el caracter que desea realizar
                           A. Suma 
                           B. Resta 
                           C. Multiplicacion  
                           D. Division
                           E. Modulo 
                           """);
        System.out.print("Respuesta: ");
        input.nextLine();
        caracter = input.nextLine().toUpperCase().charAt(0);

        switch (caracter) {

            case 'A':
                suma = numero1 + numero2;
                System.out.printf("La suma de %d + %d = %d\n", numero1, numero2, suma);
                break;
            case 'B':
                resta = numero1 - numero2;
                System.out.printf("La resta de %d - %d = %d\n", numero1, numero2, resta);
                break;
            case 'C':
                multiplicacion = numero1 * numero2;
                System.out.printf("La multiplicacion de %d * %d = %d\n", numero1, numero2, multiplicacion);
                break;
            case 'D':
                if (numero2 != 0) {
                    division = (double) numero1 / numero2;
                    System.out.printf("La division de %d / %d = %.2f\n", numero1, numero2, division);
                } else {
                    System.out.println("ERROR!!, La division entre 0 no esta definida");
                }
                break;
            case 'E':
                if (numero2 != 0) {
                    modulo = numero1 % numero2;
                    System.out.printf("El modulo de %d %% %d = %d\n", numero1, numero2, modulo);
                } else {
                    System.out.println("ERROR!!, no es posible calcular el modulo entre 0");
                }
                break;
            default:
                System.out.println("Operador no reconocido");
                break;
        }//Fin switch

    }//Fin Main

}//Fin Class
