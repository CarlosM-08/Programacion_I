/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 * Desarollar un algoritmo que permita convertor valores de longitud de acuerdo a la base que se tenga
 * Pulgadas - Centimetros
 * Kilometros - Millas
 * Grados Celsius - Grados Farenheit
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in); //Scanner es un objet, teclado es una instancia
        //Declaracion de Variables
        int pulgada = 0;
        double resultadoCM = 0; //-> Asignando unvalor pos el signo =        
        double kilometros = 100;
        double millas = 0;
        double celsius = 0;
        double farenheit = 0;
        
        //PULGADAS A CENTIMETROS
        System.out.println("Tenemos 5 pulgadas");
        System.out.println("Cuanto es eso en CM?");
        
        pulgada = 5;
        resultadoCM = pulgada * 2.54;
        
        System.out.printf("%d pulgadas es equivalente a %.2fcm",pulgada,resultadoCM);
        
        pulgada = 12;
        resultadoCM = pulgada* 2.54;
        System.out.printf("\n%.2fcm es equivalente a %d pulgadas\n",resultadoCM,pulgada);
        
        //KILOMETROS A MILLAS
        System.out.println("\nDime cuantos kilometros son?");
        kilometros = teclado.nextDouble();
        millas = kilometros / 1.6;
        
        //CELSIUS A FARENHEIT
        System.out.printf("%.2f km es igual a %.3f millas\n",kilometros,millas);
        
        System.out.println("\nDime cuantos grados celcius son?");
        celsius = teclado.nextDouble();
        farenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f grados celsius es igual a %.2f grados farenheit\n",celsius,farenheit);
        
                
        
        
    }//Fin de main
    
}// Fin de Class
