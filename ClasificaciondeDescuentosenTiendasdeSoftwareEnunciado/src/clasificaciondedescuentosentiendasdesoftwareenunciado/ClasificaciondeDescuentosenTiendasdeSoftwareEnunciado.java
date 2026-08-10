/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondedescuentosentiendasdesoftwareenunciado;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class ClasificaciondeDescuentosenTiendasdeSoftwareEnunciado {

    /**
     * Clasificación de Descuentos en Tienda de Software Enunciado
     * Una tienda de software ofrece descuentos basados en la edad del cliente 
     * y si tiene una membresía premium. Se tiene que solicitar la edad y si tiene 
     * membresía ('S' para sí, 'N' para no).
     *      Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
     *          A.  Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si cumple 
     *              alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un 10%
     *          B.  Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es así, 
     *              recibe un 15% de descuento. De lo contrario, no tiene descuento (0%).
     * El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta original 
     * y el nuevo total que se tiene que pagar por el juego.
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declaracion de variables
        int edad = 0;
        char membresia = 'S';
        double precioinial = 0;
        double preciofinal = 0;
        double descuento = 0;
        
        System.out.print("Ingrese la edad de la persona: ");
        edad = input.nextInt();        
        System.out.print("Cuenta con membresia S = Si, N = NO: ");
        input.nextLine();
        membresia = input.nextLine().toUpperCase().charAt(0);
        System.out.print("Ingrese el precio de venta inicial: ");
        precioinial = input.nextDouble();
        
        
        if(edad >= 18){
            if (edad > 65 || membresia == 'S'){
                System.out.println("Tiene derecho a un 20% de descuento!!");
                descuento = (precioinial * 0.20);
                preciofinal = precioinial - descuento;
                System.out.printf("El descuento aplicado es de %.2f\n", descuento);
                System.out.printf("El precio final a pagar despues de aplicado el 20%% es %.2f\n", preciofinal);
                
            }//Fin if 20% descuento
            else{
                System.out.println("Tiene derecho a un 10% de descuento!!");
                descuento = (precioinial * 0.10);
                preciofinal = precioinial - descuento;
                System.out.printf("El descuento aplicado es de %.2f\n", descuento);
                System.out.printf("El precio final a pagar despues de aplicado el 10%% es %.2f\n", preciofinal);
            }
        }//Fin if de edad
        else{
            if(edad > 12 && membresia == 'S'){
                System.out.println("Tiene derecho a un 15% de descuento!!");
                descuento = (precioinial * 0.15);
                preciofinal = precioinial - descuento;
                System.out.printf("El descuento aplicado es de %.2f\n", descuento);
                System.out.printf("El precio final a pagar despues de aplicado el 15%% es %.2f\n", preciofinal);
            }//Fin if 15% de descuento
            else {
                System.out.println("No tiene descuento"); 
                System.out.printf("El precio final a pagar es %.2f\n", precioinial);
            }
        }
        
    }//Fin Main
    
}//Fin Class
