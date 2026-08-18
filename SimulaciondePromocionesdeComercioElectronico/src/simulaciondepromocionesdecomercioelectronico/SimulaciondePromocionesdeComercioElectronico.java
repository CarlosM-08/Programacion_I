/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciondepromocionesdecomercioelectronico;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class SimulaciondePromocionesdeComercioElectronico {

    /**
     * Simulación de Promociones de Comercio Electrónico Un sistema de ventas en línea 
     * aplica descuentos basados en códigos generados aleatoriamente. 
     * Solicita al programa procesar el carrito de 5 clientes (usando un ciclo). 
     * Para cada cliente, pide el monto total de la compra (debe ser un valor validado > 0). 
     * Genera un código promocional aleatorio de 5 caracteres combinando letras mayúsculas. 
     *      • Lógica anidada y booleana: Aplica un descuento solo si se cumplen ciertas condiciones combinadas: 
     *          o Si el total de la compra es mayor a $5000 y el código generado termina en "X" o "Z". 
     *              ▪ Si el monto es mayor a $10000, calcula el descuento usando Math.sqrt() del monto multiplicado por 2. 
     *              ▪ Si no, aplica un descuento fijo del 10%. 
     *      • Muestra el código generado, el subtotal y el total a pagar por cada cliente.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rd = new Random();
        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        int clientes = 5;
        double montoCompra = 0;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int posicion = 0;
        String codigo = "";
        int tamanocodigo = 5;
        double descuento = 0;
        double totalPago = 0;

        for (int i = 0; i < clientes; i++) {

            do {
                System.out.printf("Cliente: %d\n", i + 1);
                System.out.print("Ingrese el monto total de la compra: ");
                montoCompra = input.nextDouble();

                if (montoCompra > 0) {
                    for (int j = 0; j < tamanocodigo; j++) {
                        posicion = rd.nextInt(caracteres.length());
                        codigo += caracteres.charAt(posicion);
                    }

                    if (montoCompra > 5000 && (codigo.endsWith("X") || codigo.endsWith("Z"))) {
                        if (montoCompra > 10000) {
                            descuento = Math.sqrt(montoCompra) * 2;
                        } else {
                            descuento = montoCompra * (0.10);
                        }//Fin else descuento                    
                    }//Fin if descuento
                    totalPago = montoCompra - descuento;
                    System.out.printf("Codigo Generado: %s\t Subtotal: %.2f\t Descuento: %.2f\t Total a pagar: %.2f\n", codigo, montoCompra, descuento, totalPago);
                    codigo = "";
                    descuento = 0;

                } else {
                    System.out.println(" ERROR!!, El monto debe ser mayor que cero (0)");
                }//Fin if / else

            } while (montoCompra <= 0);

        }//Fin For

    }//Fin Main

}//Fin Class
