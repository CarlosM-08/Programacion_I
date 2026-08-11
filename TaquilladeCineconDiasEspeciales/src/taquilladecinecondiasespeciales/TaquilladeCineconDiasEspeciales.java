/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taquilladecinecondiasespeciales;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class TaquilladeCineconDiasEspeciales {

    /**
     * Taquilla de Cine con Días Especiales (switch e if/else anidado)
     *   Un cine tiene un precio base de entrada de $8.0 (double). Se le solicita la edad del cliente y 
     *   el día de la semana ingresado como un número del 1 al 7 (donde 1 es Lunes).
     *   Usando un switch para evaluar el día de la semana.
     *       • Si el día es 3 (Miércoles), el precio de la entrada se reduce a la mitad sin importar la edad 
     *       • Si es cualquier otro día, entra al bloque default del switch y usando un if/else: 
     *            o Si el cliente es menor de 12 años o mayor o igual a 65 años, se le descuentan $2.0 al precio base. 
     *   Imprime cuánto debe pagar el cliente al final.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Declaracion de variables
        
        double preciobase = 8;
        int edad = 0;
        int diasemana = 0;
        
        System.out.print("Ingrese la edad del cliente: ");
        edad = input.nextInt();
        System.out.println("""
                           Ingrese el dia de la semana
                           1: Lunes
                           2: Martes
                           3: Miercoles
                           4: jueves
                           5. Viernes
                           6. Sabado
                           7. Domingo
                           """);
        System.out.print("Respuesta: ");
        diasemana = input.nextInt();
        
        switch(diasemana){
            case 3:
                preciobase = preciobase / 2;
                System.out.printf("El cliente debe pagar $%.2f por entrada\n", preciobase);                
                break;
            default:
                if(edad < 12 || edad >= 65){
                preciobase = preciobase - 2;
                System.out.printf("El cliente debe pagar $%.2f por entrada\n", preciobase);                 
                }else{
                    System.out.printf("El cliente debe pagar $%.2f por entrada\n", preciobase);                 
                }
                break;        
        }
        
    }//Fin Main
    
}//Fin Class
