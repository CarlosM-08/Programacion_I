/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversoryalarmadetemperaturasendatacenters;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class ConversoryAlarmadeTemperaturasenDatacenters {

    /**
     * Conversor y Alarma de Temperaturas en Datacenters
     *  En un centro de datos se monitorea la temperatura. Solicita la temperatura actual (double) 
     *  y la escala original en la que está medida (char: 'C' para Celsius, 'F' para Fahrenheit).
     *  
     *  Usa un switch para hacer la conversión a la escala contraria:
     *      • Si ingresa 'C', calcula y guarda la temperatura en Fahrenheit (C * 9/5) + 32. 
     *      • Si ingresa 'F', calcula y guarda la temperatura en Celsius (F - 32) * 5/9
     * 
     *  Tras la conversión, usando una sola estructura if/else if usando operadores booleanos para 
     *  lanzar advertencias (evaluando los Celsius resultantes o ingresados):
     *      • Si la temperatura en Celsius es mayor a 35.0 o la de Fahrenheit es mayor a 95.0: Imprime 
     *        "ALERTA: Peligro de sobrecalentamiento en servidores". 
     *      • Si la temperatura en Celsius es menor a 10.0: Imprime "ALERTA: Temperatura demasiado baja 
     *        para operación óptima". 
     *      • En caso contrario: Imprime "Temperatura en rango normal".
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        double temperaturaactual = 0;
        char escala = '@';
        double fahrenheit = 0;
        double celsius = 0;

        System.out.print("Ingrese la temperatura actual: ");
        temperaturaactual = input.nextDouble();
        celsius = temperaturaactual;
        fahrenheit = temperaturaactual;
        System.out.print("""
                           Ingrese la escala de la temperatura
                           C: Celsius
                           F: Fahrenheit
                           """);
        System.out.print("Respuesta: ");
        input.nextLine();
        escala = input.nextLine().toUpperCase().charAt(0);       

        switch (escala) {
            case 'C':
                fahrenheit = (celsius * (9 / 5)) + 32;
                System.out.printf("%.2f grados Celsius es igual a %.2f grados Farhrenheit\n", temperaturaactual, fahrenheit);
                break;
            case 'F':
                celsius = ((fahrenheit - 32) * (5.0 / 9));
                System.out.printf("%.2f grados Fahrenheit es igual a %.2f grados Celsius\n", temperaturaactual, celsius);
                break;
            default:
                break;
        }

        if (celsius > 35 || fahrenheit > 95){
            System.out.println("ALERTA:  Peligro de sobrecalentamiento en servidores");
        }else{
              if(celsius < 10.0){
                System.out.println("ALERTA: Temperatura demasiado baja para operacion optima");
                }else {
                  System.out.println("Temperatura en rango normal");              
              } 
                }

    }//Fin Main

}//Fin Class
