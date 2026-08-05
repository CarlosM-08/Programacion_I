/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicaciondeporcentajededescuento;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class AplicacionDePorcentajeDeDescuento {

    // Aplicación de porcentaje de descuento
    /*  Desarrolle un programa que solicite el precio original
        de un artículo y el porcentaje de descuento que se le aplicará 
        (por ejemplo, 15). Calcule el monto en dinero que representa 
        ese descuento y réstelo al precio original para mostrarle al 
        usuario el precio final a pagar.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaracion de variables
        double precioinicial = 0;
        double porcentajedesc = 0;
        double descuento = 0;
        double preciofinal = 0;

        System.out.print("Ingrese el valor del producto (valor sin decuento): ");
        precioinicial = teclado.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento (valor entero): ");
        porcentajedesc = teclado.nextDouble();

        descuento = precioinicial * (porcentajedesc / 100);
        preciofinal = precioinicial - descuento;

        System.out.printf("El descuento es igual a %.2f\n", descuento);
        System.out.printf("EL precio final del producto despues de aplicar el %.2f%% de descuento es: %.2f\n", porcentajedesc, preciofinal);

    }//Fin Main

}//Fin Class
