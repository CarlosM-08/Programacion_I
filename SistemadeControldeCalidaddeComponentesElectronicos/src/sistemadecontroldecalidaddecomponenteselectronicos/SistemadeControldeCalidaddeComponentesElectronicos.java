/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadecontroldecalidaddecomponenteselectronicos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class SistemadeControldeCalidaddeComponentesElectronicos {

    /**
     * Sistema de Control de Calidad de Componentes Electrónicos Simula la inspección de un lote de resistencias eléctricas. 
     * El usuario ingresa el número de componentes en el lote. Usa Math.random() o la clase Random para generar un valor en 
     * ohmios para cada resistencia, fluctuando entre 900 y 1100 ohmios.
     *  • Lógica anidada y booleana: Una resistencia es clasificada con un código de String ("A-PASS", "B-WARN", "C-FAIL").
     *      o Si el valor está entre 990 y 1010, asigna "A-PASS".
     *      o Si el valor es menor a 990 o mayor a 1010, 
     *          ▪ Si la diferencia absoluta (Math.abs) respecto a 1000 es menor a 50, asigna "B-WARN".
     *          ▪ Si la diferencia es mayor a 50, asigna "C-FAIL".
     *  • Al final, imprime un resumen de cuántas resistencias cayeron en cada categoría.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        
        //Declaracion de variables
        int numComponentes = 0;
        int componente = 0;
        int aPass = 0, bWarn = 0, cFail = 0;
        int diferencia = 0;
        
        System.out.print("Ingresa el numero de componentes en el lote: ");
        numComponentes = input.nextInt();
        
        for (int i = 1; i <= numComponentes; i++) {
            componente = rd.nextInt(900, 1100); 
            
            //CLASIFICACION
            if (componente >= 990 && componente <= 1010) {
                System.out.printf("Valor en Ohnios de la resistencia %d: %d\t Clasificacion: A-PASS\n", i, componente);
                aPass++;
            } else {
                diferencia = 1000 - componente;

                if (Math.abs(diferencia) < 50) {
                    System.out.printf("Valor en Ohnios de la resistencia %d: %d\t Clasificacion: B-WARN\n", i, componente);
                    bWarn++;
                }else{
                    System.out.printf("Valor en Ohnios de la resistencia %d: %d\t Clasificacion: C-FAIL\n", i, componente);  
                    cFail++;
                }//fin else
            }//Fin if / else Clasificacion        
        }//Fin for
        
        //RESUMEN
        System.out.println("");
        System.out.println("=====RESUMEN=====");
        System.out.printf("Cantidad de resistencias en categotia A-PASS: %d\n", aPass);
        System.out.printf("Cantidad de resistencias en categotia B-WARN: %d\n", bWarn);
        System.out.printf("Cantidad de resistencias en categotia C-FAIL: %d\n", cFail);
        
    }//Fin Main
    
}//Fin Class
