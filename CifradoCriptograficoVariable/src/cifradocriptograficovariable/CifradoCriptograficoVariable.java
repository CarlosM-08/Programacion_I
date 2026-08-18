/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradocriptograficovariable;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class CifradoCriptograficoVariable {

    /**
     * Cifrado Criptográfico Variable 
     * Solicita al usuario una frase para ser cifrada.  Utiliza un ciclo para recorrer cada carácter de 
     * la cadena. Genera una semilla de desplazamiento aleatoria (Random) entre 1 y 5 para cada ejecución del programa. 
     *      • Lógica anidada y booleana: Utiliza condicionales anidados para determinar si el carácter 
     *        es una letra mayúscula, minúscula, o un número. 
     *          o Solo aplica el desplazamiento (operación aritmética sobre el valor ASCII) si el carácter 
     *            es una letra y no es un espacio en blanco. 
     *          o Si el carácter desplazado supera la letra 'Z' (o 'z'), debes usar lógica matemática y 
     *            condicional para que el ciclo vuelva a comenzar desde la 'A' (o 'a'). 
     *      • Imprime la frase original y la frase cifrada. 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        int desplazamiento = 0;
        char caracter = '@';
        String newFrase = "";

        //Declaracion de variables
        String frase = "Sin frase asignada";

        //FRASE SOLICITADA
        System.out.print("Ingresa una frase para ser cifrada: ");
        frase = input.nextLine();

        desplazamiento = rd.nextInt(1, 6);

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                if (Character.isUpperCase(caracter)) {
                    caracter += desplazamiento;
                    if (caracter > 'Z') {
                        caracter -= 26;
                    }
                } else {
                    if (Character.isLowerCase(caracter)) {
                        caracter += desplazamiento;
                        if (caracter > 'z') {
                            caracter -= 26;
                        }
                    }
                }
            }

            newFrase += caracter;

        }//Fin for

        System.out.printf("Frase original: %s\n", frase);
        System.out.printf("Frase encriptada : %s\n", newFrase);

    }//Fin Main

}//Fin Class
