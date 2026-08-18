/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciondetrayectoriabalistica;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class SimulaciondeTrayectoriaBalistica {

    /**
     * Simulación de Trayectoria Balística (Uso estricto de for)
     *  Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
     *  velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
     *  correspondiente a la trayectoria.
     *      • Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente entre 
     *        1 y 89 grados.
     *      • Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del proyectil 
     *        (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el segundo 𝑡 = 10.
     *      • Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el proyectil 
     *        alcanza su altura máxima estimada y en qué momento su altura empieza a ser negativa (lo que significa
     *        que ya impactó el suelo, momento en el cual el ciclo debe romperse mediante break). Nota: Utiliza la 
     *        fórmula de posición vertical de la cinemática.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        double vInicial = 0;
        double angulo = 0;
        int tiempo = 10;
        int segundo = 0;
        double h = 0;
        double gravedad = 9.81;
        double alturaMax = 0;

        System.out.print("Ingrese la velocidad inicial (m/s): ");
        vInicial = input.nextDouble();
        System.out.print("Ingrese el angulo de lanzamiento (grados): ");
        angulo = input.nextDouble();

        //validacion
        if (!(vInicial > 0 && angulo >= 1 && angulo <= 89)) {

            System.out.println("Datos Invalidos");
        } else {
            for (int i = 1; i <= tiempo; i++) {

                h = (vInicial * Math.sin(Math.toRadians(angulo)) * i) - (0.5 * gravedad * i * i);
                if (h <= 0) {
                    h = 0;
                    System.out.printf("El proyectil llego al suelo en el segundo: %d\n", i);
                    break;
                } else {
                    System.out.printf("Altura en el segundo %d es: %.2f\n", i, h);
                    if (h > alturaMax) {
                        alturaMax = h;
                        segundo = i;
                    }
                }
            } //Fin for 
            
            System.out.printf("La altura maxima es %.2f y ocurrio en el segundo %d\n", alturaMax, segundo);

        }//Fin if / else validacion

    }//Fin Main

}//Fin Class
