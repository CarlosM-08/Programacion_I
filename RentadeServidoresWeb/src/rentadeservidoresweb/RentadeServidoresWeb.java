/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentadeservidoresweb;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class RentadeServidoresWeb {

    /**
     * Renta de Servidores Web
     * Una empresa de hosting renta servidores. El costo base por día es de $10.0. 
     * Se le pide al usuario la cantidad de días y el tipo de plan (“A” Básico, “B” Pro, 
     * “C” Empresarial). Usando un switch para añadir un costo extra diario:
     *      Plan Básico se suma $0
     *      Plan Pro se suma $5
     *      Plan Empresarial se suma $15.
     * Después de calcular el subtotal, usar una estructura de selección simple para aplicar 
     * una promoción:
     *      Si el cliente renta el servidor por más de 15 días y el plan es 'B'o 'C', se le 
     *      aplica un 15% de descuento al total.
     * Se tiene que mostrar el total a pagar, la cantidad de días de renta y el plan seleccionado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Declaracion de variables
        double costobase = 10;
        int dias = 0;
        char plan = 'A';
        double totalpagar = 0;
        double descuento = 0;
        double preciofinal = 0;
        
        System.out.print("Ingrese la cantidad de dias que rentara los servidores: ");
        dias = input.nextInt();
        System.out.println("""
                           Seleccione el tipo de plan:
                           A. Plan Basico
                           B. Plan Pro
                           C. Plan Empresarial
                           """);
        System.out.print("Respuesta: ");
        input.nextLine();
        plan = input.nextLine().toUpperCase().charAt(0);
        
        switch(plan){
            case 'A':                
                    totalpagar = dias * costobase;
                    System.out.printf("la cantidad de dias es %d\n", dias);
                    System.out.println("El plan seleccionado es Plan Basico");
                    System.out.printf("la cantidad a pagar es es $%.2f\n", totalpagar);                
                break;
            case 'B':
                if(dias > 15){
                    totalpagar = dias * (costobase + 5);
                    descuento = totalpagar * 0.15;
                    preciofinal = totalpagar - descuento;                    
                    System.out.printf("la cantidad de dias es %d\n", dias);
                    System.out.println("El plan seleccionado es Plan Pro");
                    System.out.printf("El descuento aplicado es de: %.2f\n", descuento);
                    System.out.printf("la cantidad a pagar es es $%.2f\n", preciofinal);                  
                }else{
                    totalpagar = dias * (costobase + 5);                                     
                    System.out.printf("la cantidad de dias es %d\n", dias);
                    System.out.println("El plan seleccionado es Plan Pro");                    
                    System.out.printf("la cantidad a pagar es es $%.2f\n", totalpagar);                
                }
                break;
            case 'C':
                if(dias > 15){
                    totalpagar = dias * (costobase + 15);
                    descuento = totalpagar * 0.15;
                    preciofinal = totalpagar - descuento;                    
                    System.out.printf("la cantidad de dias es %d\n", dias);
                    System.out.println("El plan seleccionado es Plan Empresarial");
                    System.out.printf("El descuento aplicado es de: %.2f\n", descuento);
                    System.out.printf("la cantidad a pagar es es $%.2f\n", preciofinal);                  
                }else{
                    totalpagar = dias * (costobase + 15);                                     
                    System.out.printf("la cantidad de dias es %d\n", dias);
                    System.out.println("El plan seleccionado es Plan Empresarial");                    
                    System.out.printf("la cantidad a pagar es es $%.2f\n", totalpagar);                
                }
                break;
            default:
                break;
        
        }
    }//Fin Main
    
}//Fin Class
