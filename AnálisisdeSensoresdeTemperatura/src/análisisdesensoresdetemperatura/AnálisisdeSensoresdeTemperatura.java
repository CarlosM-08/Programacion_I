/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package análisisdesensoresdetemperatura;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class AnálisisdeSensoresdeTemperatura {

    /**
     *  Análisis de Sensores de Temperatura (Uso While) 
     *   Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados) 
     *   registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese 
     *   el valor centinela −999. 
     *      • Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). 
     *        Si el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe 
     *        mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos. 
     *      • Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas 
     *        ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Declaracion de variables
        double temperatura = 0;
        double temAcum = 0;
        double promTem = 0;
        int canTemp = 0;
        double temMax = 0;
        double temMin = 0;
        double difTermica = 0;
        
        while (temperatura != -999) {
            System.out.print("Ingrese el valor de la temperatura (en grados centigrados): ");
            temperatura = input.nextDouble();
            
                        
            if (temperatura == -999) {
                break;                
            }//Fin if (validacion de valor centinela)
            
            if (temperatura >= -273.15) {                
                temMin = temperatura;
                temAcum += temperatura;
                canTemp++;   
                if (temperatura > temMax) {
                    temMax = temperatura; 
                    
                } 
                if (temperatura < temMin) {
                    temMin = temperatura;                        
                }                   
                
            }else{
                System.out.println("ERROR, temperatura no valida");                 
            }//fin if/else (validacion de temperatura absoluta)
        }//Fin while
        
        if (canTemp > 0) {
            promTem = temAcum / canTemp;
            difTermica = temMax - temMin;
            System.out.printf("temperatura acumulada: %.2f\n", temAcum);
            System.out.printf("Cantidad de temperaturas validas registradas: %d\n", canTemp);
            System.out.printf("El promedio de las temperaturas validas ingresadas es: %.2f\n", promTem);
            System.out.printf("La temperatura Maxima es %.2f\n",temMax);   
            System.out.printf("La temperatura minima es: %.2f\n",temMin);
            System.out.printf("La diferencia termica es: %.2f\n", difTermica);
        }else{
            System.out.println("No se ingresaron temperaturas validas");        
        }        
        
    }//Fin Main
    
}//FIn Class
