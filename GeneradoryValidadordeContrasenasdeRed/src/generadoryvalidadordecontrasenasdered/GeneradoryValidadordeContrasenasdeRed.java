/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadoryvalidadordecontrasenasdered;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class GeneradoryValidadordeContrasenasdeRed {

    /**
     * Generador y Validador de Contraseñas de Red Desarrolla un programa que genere contraseñas aleatorias y evalúe su fortaleza. 
     * Pide al usuario cuántas contraseñas desea evaluar. En un ciclo, genera cadenas de texto combinando letras, números y símbolos
     * aleatorios (usando Random y métodos de String). 
     *      • Lógica anidada y booleana: Para cada contraseña generada, evalúa mediante if anidados su nivel: 
     *          o Fuerte: Longitud > 10 caracteres y contiene al menos un número y contiene un símbolo (e.g., @, #, $).
     *          o Media: Longitud entre 8 y 10 caracteres y contiene al menos un número o contiene un símbolo.
     *          o Débil: Cualquier otra combinación. Muestra la contraseña generada con la clase String y su clasificación.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rd = new Random();
        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "123456789" + "!@#$%&*_-?";
        int cantidad = 0;
        int posicion = 0;
        char caracterAleatorio = ' ';
        String password = "";
        int tamano = 0;
        boolean tieneNumero = false;
        boolean tieneLetra = false;
        boolean tieneSimbolo = false;

        //SOLICITUD DE PASSWORD A EVALUAR
        System.out.print("Cuantas password desea evaluar: ");
        cantidad = input.nextInt();

        for (int i = 0; i < cantidad; i++) {

            //tamaño de la contraseña        
            tamano = rd.nextInt(4, 20);

            //Generacion de password
            do {
                posicion = rd.nextInt(caracteres.length());
                password += caracteres.charAt(posicion);
            } while (password.length() < tamano);
            System.out.println(password);

            //Comprobar si el password contiene letra, numero o simbolo
            for (int j = 0; j < password.length(); j++) {

                if (Character.isDigit(password.charAt(j))) {
                    tieneNumero = true;
                } else {
                    if (Character.isLetter(password.charAt(j))) {
                        tieneLetra = true;
                    } else {
                        tieneSimbolo = true;
                    }
                }//Fin if/else comprobacion
            }//Fin for comprobacion letra, numero, simbolo

            //EVALUACION DEL PASSWORD
            if (password.length() > 10 && tieneNumero == true && tieneSimbolo == true) {
                System.out.println("El password es FUERTE");
            } else {
                if ((password.length() >= 8 && password.length() <= 10) && tieneNumero == true && tieneSimbolo == true) {
                    System.out.println("El password es MEDIA");
                } else {
                    System.out.println("El password es DEBIL");
                }//Fin else
            }//Fin if / else de evaluacion de password

            password = "";

        }//Fin for        

    }//Fin Main

}//Fin Class
