/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodeclase;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class EstadodeClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //conociendo la Estructura
        /*
            1. Palabra Clave "if" y/o "else"
            2. el grupo de instrucciones se encierra entre {}
            3. No se usa ";" para los bloques
            4. la consicion es una comparacion bajo cualquiera de los siguientes elementos:
                a. <    menor
                b. >    mayor
                c. <=    menor o igual
                d. >=   mayor o igual
                e. ==   igual(uso de dos signos)        
        */
        
        int cantidadagua = 0;
        char respuesta = '@';
        String respuestaAmbiente = "Jonh Doe";
        
        System.out.println("El bote es de 500ml");
        System.out.print("Cuanto liquido dices que tienes: ");
        cantidadagua = input.nextInt();
        
        //a. esta arriba de la mitad
        if(cantidadagua >= 250){
           // Condicion VERDADERO
            System.out.println("Si, tiene mas de la mitad");
            System.out.println("Te lo puedes beber!!!");
            System.out.println("No nos quedamos sin nada... hay suficiente");
        }        
        input.nextLine();//Limpieza del buffer, se utiliza cuando en memoria de variable (input) se tiene un valor almacendao de caracter y se va a capturar un valor carater a numerico
        
        System.out.println("");
        System.out.println("El liquido que contiene es H2O? (a=SI; b=NO");
        respuesta = input.nextLine().charAt(0);
        
        if (respuesta == 'a') {
            //Condicion Verdadera
            System.out.println("""
                               Si es agua lo que contiene
                               No es otra cosa... nada embriagante.!!
                               """);
        }
        else{
            //Condicion Falsa
            System.out.println("""
                               Uy uy Uy
                               Que sera?...
                               """);
        }
        /*
        System.out.printf("\nEse bote que contiene %d mL",cantidadagua);
        System.out.println("\nEs amigable con el ambiente?");
        respuestaAmbiente = input.nextLine();
        System.out.printf("Dato de Variable: %s ",respuestaAmbiente);
        
        System.out.println("Seguro?");        
        respuestaAmbiente = input.nextLine().toUpperCase(); // captura toda la linea de texto se detiene cuando identifica un enter (salto de linea)
        System.out.printf("Dato de Variable: %s ",respuestaAmbiente);
        
        System.out.println("100% Seguro");        
        respuestaAmbiente = input.next().toLowerCase();//solo captura la primera cadena se detiene cuando encuentra un espacio o un enter (salto de linea)
        System.out.printf("Dato de Variable: %s \n",respuestaAmbiente);
        */
        if (respuestaAmbiente.equals("Si")){
            System.out.println("Es amigable con el ambiente");
        }
        else{
            System.out.println("No es amigable");
        }
    }//fin de Main
    
}//fin de Class 
